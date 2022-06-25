1.사용자 생성
 
2.혹시 모를 테이블과 제약조건을 삭제합니다
drop table board cascade constraints purge; --제약 조건이 있는 경우 제약조건을 삭제합니다
											-- 부모 테이블인 경우 자식에 대한 제약 조건도 삭제 됩니다.
3. 테이블을 생성합니다
CREATE TABLE BOARD(
	BOARD_NUM         NUMBER(5),         --글 번호(기본 키)
	BOARD_NAME        VARCHAR2(30),   --작성자
	BOARD_PASS          VARCHAR2(30),   --비밀번호
	BOARD_SUBJECT      VARCHAR2(300),  --제목
	BOARD_CONTENT    VARCHAR2(4000), --내용
	BOARD_FILE            VARCHAR2(50),   --첨부될 파일 명(시스템에 저장되는 파일명)
	BOARD_ORIGINAL    VARCHAR2(50),   --첨부될 파일 명(시스템에 저장된 파일의 원래 파일명)
	BOARD_RE_REF         NUMBER(5),      --답변 글 작성시 참조되는 글의 번호
	BOARD_RE_LEV         NUMBER(5),      --답변 글의 깊이(원문 글:0, 답변:1, 답변의 답변2, 답변의 답변의 답변 :3)
	BOARD_RE_SEQ         NUMBER(5),     --답변 글의 순서(원문 글 기준으로 보여2주는 순서)
	BOARD_READCOUNT NUMBER(5),      --글의 조회수
	BOARD_DATE DATE,                         --글의 작성 날짜
	PRIMARY KEY(BOARD_NUM)
);

select * from board;
delete from board;

3. 글번호는 시퀀스를 사용합니다.
			시퀀스 이름 : board_seq
			시작값 :1
			증가값 :1
			
drop sequence BOARD_SEQ;
create sequence BOARD_SEQ;

4. 테이블 조회와 같이 원문들이 저장되도록 insert문을 작성하세요
	조건1) 원문글의 경우 BOARD_RE_REF 컬럼의 값은 원문 글 번호와 같습니다.                   
          조건2) BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT 값은 모두 0 입니다.
          조건3) BOARD_DATE는 시스템 날짜입니다.
          조건4) BOARD_FILE, BOARD_ORIGINAL는 null로 처리합니다.
          조건5) 비밀번호 삽입은 하지만 조회 시 제외합니다.
	
	
sql문) insert into board
(BOARD_NUM,BOARD_NAME, BOARD_PASS,BOARD_SUBJECT,
BOARD_CONTENT, BOARD_RE_REF,
BOARD_RE_LEV,BOARD_RE_SEQ, BOARD_READCOUNT,
BOARD_DATE)
values(board_seq.nextval, 'admin','1','JSP 공부는 재미있어요',
		'열심히 해봐요',board_seq.nextval,
		0,0,0,
		sysdate);

5. 원문글에 답변을 달도록 쿼리문을 작성하세요 (Insert문)
  
  조건1)글번호는 시퀀스로 증가합니다
  조건2) BOARD_RE_REF 컬럼의 값은 원문글의 글 번호와 일치합니다.
  조건3) BOARD_RE_LEV, BOARD_RE_SEQ는 원문글의 BOARD_RE_LEV, BOARD_RE_SEQ 보다 1씩증가합니다.
		
select * from board;

6.   테이블 조회는  BOARD_RE_REF를 기준으로 내림차순으로 정렬하고,
     BOARD_RE_REF 같으면 BOARD_RE_SEQ를 오름차순 기준으로 정렬합니다.
     정렬기준으로 처음부터 10개를 조회합니다.(SELECT문 사용)
     
     1단계
     select * from board
     order by BOARD_RE_REF desc,
     BOARD_RE_SEQ asc
     where rownum <=10;
     
     2단계
     select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT, 
     BOARD_CONTENT, BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV, 
     BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE
     FROM (select * FROM BOARD
     		ORDER BY BOARD_RE_REF DESC,
     		BOARD_RE_SEQ ASC)
     WHERE 	rownum <=10;
     
     3단계
     select *
     from ( select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT, 
    				 BOARD_CONTENT, BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV, 
    				 BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE
    		 FROM (select * FROM BOARD
     					ORDER BY BOARD_RE_REF DESC,
     					BOARD_RE_SEQ ASC)
     		where rownum <=40)
     		where rnum>=31 and rnum<=40;

7. 원문글에  답변을 추가하는 경우 기존 글들의 BOARD_RE_SEQ는 1증가합니다.  (UPDATE문 사용)
   조건) BOARD_RE_REF가 원문글의 번호이고 
          BOARD_RE_SEQ값이 원문글의 BOARD_RE_SEQ보다 큰 경우에만 
          답변의 BOARD_RE_SEQ는 1증가합니다
          
select count (*) from board