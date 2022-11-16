SELECT * FROM kurlyuser;
SELECT * FROM buylist;
SELECT * FROM buy;
SELECT * FROM product;
SELECT * FROM qna;
SELECT * FROM notice;
DROP TABLE notice;
DROP TABLE qna;
DROP TABLE product;
DROP TABLE buy;
DROP TABLE buylist;
DROP TABLE kurlyuser;

CREATE TABLE kurlyuser(
		userno varchar2(20) PRIMARY KEY,
		div varchar2(20),
		username varchar2(20),
		rrn varchar2(14),
		address varchar2(100),
		phonenumber varchar2(13),
		id varchar(20),
		password varchar2(20),
		point NUMBER
		);
--userno, div, username, rrn, address, phonenumber, id, password, point
--scanuserno, scandiv, scanusername, scanrrn, scanaddress, 
--scanphonenumber, scanid, scanpassword, scanpoint
CREATE SEQUENCE kurlyuser_seq 
START WITH 1
INCREMENT BY 1
   MINVALUE 1
   MAXVALUE 9999;
 SELECT * FROM kurlyuser;
Drop TABLE KURLYUSER;
DROP SEQUENCE kurlyuser_seq;
INSERT INTO kurlyuser values(0,'관리자',
'이또치','880808-1818188','천안시 서북구 불당24로','010-1234-1234','ddochi','ddochi123',999999);	
INSERT INTO kurlyuser values(kurlyuser_seq.NEXTval,'회원',
'이둘리','770707-1717177','대전광역시 중구 충무로','010-1321-1321','doolli','doolli123',3000);	
UPDATE "USER" SET rrn = 991122-2222222
WHERE USERNAME = '이윤아'; --수정
DELETE  FROM kurlyuser  WHERE USERNO = 0; --탈퇴


CREATE TABLE product(
		isbn varchar2(20) PRIMARY KEY,
		fication varchar2(20),
		productname varchar2(100),
		price NUMBER,
		information varchar2(2000),
		pompany varchar2(20),
		registerdate DATE,
		discount float
		);
	--isbn fication productname price information pompany registerdate discount
DROP TABLE product;
--제품번호 분류 제품이름 가격 설명 제조사 등록일자 
INSERT INTO product values(product_seq.NEXTval,'정육계란',
'[미트클레버]소갈비찜',35000,'식탁을 빛내줄 메인요리로 미트클레버의 소갈비찜을 제안할게요.','미트클레버',to_date(20221101,'YYYYMMDD'),0.1);	
INSERT INTO product values(product_seq.NEXTval,'채소',
'김장용 평창 고랭지 절임 배추 10kg',39900,'신선한 평창의 배추로 맛있는 김장을 해요.','평창군농협',to_date(20221115,'YYYYMMDD'),3);	
INSERT INTO product values(product_seq.NEXTval,'정육계란',
'[이치류]드라이에이징 양갈비 구이',23900,'매장을 방문한 듯한 맛을 느낄 수 있을 거예요.','이치류',to_date(20221107,'YYYYMMDD'),0);	
SELECT * FROM PRODUCT ;
UPDATE product SET INFORMATION = '매장을 방문한 듯한 맛을 느낄 수 있을 거예요.'
WHERE isbn = 22; --수정
UPDATE product SET discount = 0
WHERE isbn = 21; --수정
SELECT * FROM product WHERE discount >0 ORDER BY discount desc; --알뜰기획 정렬 
SELECT * FROM product ORDER BY REGISTERDATE desc; --신상품 정렬 
SELECT * FROM product WHERE sysdate-7<registerdate ORDER BY REGISTERDATE desc; --
SELECT * FROM product WHERE sysdate-8<registerdate ORDER BY REGISTERDATE desc; --

DELETE  FROM product  WHERE isbn = 7; --삭제 

UPDATE product SET sale= 0
WHERE isbn = 1; --수정

CREATE SEQUENCE product_seq 
START WITH 1
INCREMENT BY 1
   MINVALUE 1
   MAXVALUE 9999;