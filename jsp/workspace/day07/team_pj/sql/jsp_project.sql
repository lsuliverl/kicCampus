--------------------"member" 테이블--------------------

CREATE SEQUENCE mnum_seq
       INCREMENT BY 1
       START WITH 10000
       MINVALUE 10000
       MAXVALUE 19999
       NOCYCLE
       NOCACHE
       NOORDER;


CREATE TABLE "member"(
   userid       varchar2(10) PRIMARY KEY,
   userpw      	varchar2(30),
   useremail   	varchar2(50),
   userphone   	varchar2(20)
);

INSERT INTO "member" VALUES (mnum_seq.NEXTVAL,'test','test','test');
INSERT INTO "member" VALUES (mnum_seq.NEXTVAL,'test2','test2','test2');

SELECT * FROM "member";



--------------------portfolio 테이블--------------------
CREATE SEQUENCE 	portfolio_seq
	START WITH 		10000
	INCREMENT BY 	1
	NOCACHE;

CREATE TABLE portfolio(
	pnum			   varchar2(10) PRIMARY KEY ,	
	ptitle			varchar2(225),
	pcontents		CLOB,
	purl			   varchar2(225),
	ppath			   varchar2(225),
	userid			   varchar2(10),
	CONSTRAINT		mnum_fkey	FOREIGN KEY(userid)
	REFERENCES 		"member"(userid)
);

INSERT INTO portfolio
	VALUES 	(portfolio_seq.nextval, 
			   'Portfolio Title', 
			   'Portfolio Content', 
			   'http://example.com', 
			   '/path/to/file', 
			   'user'
            );

SELECT * FROM portfolio;



--------------------coverletter 테이블--------------------
CREATE TABLE coverletter(
	cnum		varchar2(10) PRIMARY KEY ,	
	ctitle		varchar2(300),
	ccontents	varchar2(1500),
	userid		varchar2(10),
	CONSTRAINT	userid_fk	FOREIGN KEY(userid)
	REFERENCES "member"(userid)
);

CREATE SEQUENCE cnum_seq
START WITH 100
INCREMENT BY 1
nocache
;

INSERT INTO coverletter 
VALUES (cnum_seq.nextval,'test','test', 'admin');

SELECT * FROM coverletter;


--------------------resumes 테이블--------------------

CREATE TABLE resumes(
	rnum			varchar2(10) PRIMARY KEY,
	username		varchar2(20),
	birth			varchar2(10),
	gender			varchar2(10),
	addr			varchar2(50),
	history			varchar2(20),
	school			varchar2(20),
	major			varchar2(20),
	term			varchar2(30),
	career			varchar2(200),
	etc				varchar2(200),
	userid			varchar2(10),
	CONSTRAINT		userid_fkey	FOREIGN KEY(userid)
	REFERENCES 		"member"(userid)
);


SELECT * FROM resumes;


CREATE SEQUENCE rnum_seq
START WITH 1000
INCREMENT BY 1
nocache
;


INSERT INTO resumes
	VALUES (rnum_seq.nextval, 'test','20230303','test','seoul','test','sky','java','20232023','test','test','person');


