1.����� ����
 
2.Ȥ�� �� ���̺�� ���������� �����մϴ�
drop table board cascade constraints purge; --���� ������ �ִ� ��� ���������� �����մϴ�
											-- �θ� ���̺��� ��� �ڽĿ� ���� ���� ���ǵ� ���� �˴ϴ�.
3. ���̺��� �����մϴ�
CREATE TABLE BOARD(
	BOARD_NUM         NUMBER(5),         --�� ��ȣ(�⺻ Ű)
	BOARD_NAME        VARCHAR2(30),   --�ۼ���
	BOARD_PASS          VARCHAR2(30),   --��й�ȣ
	BOARD_SUBJECT      VARCHAR2(300),  --����
	BOARD_CONTENT    VARCHAR2(4000), --����
	BOARD_FILE            VARCHAR2(50),   --÷�ε� ���� ��(�ý��ۿ� ����Ǵ� ���ϸ�)
	BOARD_ORIGINAL    VARCHAR2(50),   --÷�ε� ���� ��(�ý��ۿ� ����� ������ ���� ���ϸ�)
	BOARD_RE_REF         NUMBER(5),      --�亯 �� �ۼ��� �����Ǵ� ���� ��ȣ
	BOARD_RE_LEV         NUMBER(5),      --�亯 ���� ����(���� ��:0, �亯:1, �亯�� �亯2, �亯�� �亯�� �亯 :3)
	BOARD_RE_SEQ         NUMBER(5),     --�亯 ���� ����(���� �� �������� ����2�ִ� ����)
	BOARD_READCOUNT NUMBER(5),      --���� ��ȸ��
	BOARD_DATE DATE,                         --���� �ۼ� ��¥
	PRIMARY KEY(BOARD_NUM)
);

select * from board;
delete from board;

3. �۹�ȣ�� �������� ����մϴ�.
			������ �̸� : board_seq
			���۰� :1
			������ :1
			
drop sequence BOARD_SEQ;
create sequence BOARD_SEQ;

4. ���̺� ��ȸ�� ���� �������� ����ǵ��� insert���� �ۼ��ϼ���
	����1) �������� ��� BOARD_RE_REF �÷��� ���� ���� �� ��ȣ�� �����ϴ�.                   
          ����2) BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT ���� ��� 0 �Դϴ�.
          ����3) BOARD_DATE�� �ý��� ��¥�Դϴ�.
          ����4) BOARD_FILE, BOARD_ORIGINAL�� null�� ó���մϴ�.
          ����5) ��й�ȣ ������ ������ ��ȸ �� �����մϴ�.
	
	
sql��) insert into board
(BOARD_NUM,BOARD_NAME, BOARD_PASS,BOARD_SUBJECT,
BOARD_CONTENT, BOARD_RE_REF,
BOARD_RE_LEV,BOARD_RE_SEQ, BOARD_READCOUNT,
BOARD_DATE)
values(board_seq.nextval, 'admin','1','JSP ���δ� ����־��',
		'������ �غ���',board_seq.nextval,
		0,0,0,
		sysdate);

5. �����ۿ� �亯�� �޵��� �������� �ۼ��ϼ��� (Insert��)
  
  ����1)�۹�ȣ�� �������� �����մϴ�
  ����2) BOARD_RE_REF �÷��� ���� �������� �� ��ȣ�� ��ġ�մϴ�.
  ����3) BOARD_RE_LEV, BOARD_RE_SEQ�� �������� BOARD_RE_LEV, BOARD_RE_SEQ ���� 1�������մϴ�.
		
select * from board;

6.   ���̺� ��ȸ��  BOARD_RE_REF�� �������� ������������ �����ϰ�,
     BOARD_RE_REF ������ BOARD_RE_SEQ�� �������� �������� �����մϴ�.
     ���ı������� ó������ 10���� ��ȸ�մϴ�.(SELECT�� ���)
     
     1�ܰ�
     select * from board
     order by BOARD_RE_REF desc,
     BOARD_RE_SEQ asc
     where rownum <=10;
     
     2�ܰ�
     select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT, 
     BOARD_CONTENT, BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV, 
     BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE
     FROM (select * FROM BOARD
     		ORDER BY BOARD_RE_REF DESC,
     		BOARD_RE_SEQ ASC)
     WHERE 	rownum <=10;
     
     3�ܰ�
     select *
     from ( select rownum rnum, BOARD_NUM, BOARD_NAME, BOARD_SUBJECT, 
    				 BOARD_CONTENT, BOARD_FILE, BOARD_ORIGINAL, BOARD_RE_REF, BOARD_RE_LEV, 
    				 BOARD_RE_SEQ, BOARD_READCOUNT, BOARD_DATE
    		 FROM (select * FROM BOARD
     					ORDER BY BOARD_RE_REF DESC,
     					BOARD_RE_SEQ ASC)
     		where rownum <=40)
     		where rnum>=31 and rnum<=40;

7. �����ۿ�  �亯�� �߰��ϴ� ��� ���� �۵��� BOARD_RE_SEQ�� 1�����մϴ�.  (UPDATE�� ���)
   ����) BOARD_RE_REF�� �������� ��ȣ�̰� 
          BOARD_RE_SEQ���� �������� BOARD_RE_SEQ���� ū ��쿡�� 
          �亯�� BOARD_RE_SEQ�� 1�����մϴ�
          
select count (*) from board