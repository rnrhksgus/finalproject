
/* Drop Tables */

DROP TABLE travel_area_review CASCADE CONSTRAINTS;
DROP TABLE travel_mypage CASCADE CONSTRAINTS;
DROP TABLE travel_area CASCADE CONSTRAINTS;
DROP TABLE travel_chart CASCADE CONSTRAINTS;
DROP TABLE travel_chat CASCADE CONSTRAINTS;
DROP TABLE travel_eat_review CASCADE CONSTRAINTS;
DROP TABLE travel_eat CASCADE CONSTRAINTS;
DROP TABLE travel_friend CASCADE CONSTRAINTS;
DROP TABLE travel_notice CASCADE CONSTRAINTS;
DROP TABLE travel_party CASCADE CONSTRAINTS;
DROP TABLE travel_qna CASCADE CONSTRAINTS;
DROP TABLE travel_sleep_review CASCADE CONSTRAINTS;
DROP TABLE travel_sleep CASCADE CONSTRAINTS;
DROP TABLE travel_user CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE travel_area
(
	a_num number NOT NULL,
	a_name varchar2(50),
	a_do varchar2(20),
	a_si varchar2(20),
	a_dong varchar2(20),
	a_tel varchar2(20),
	a_context varchar2(1000),
	PRIMARY KEY (a_num)
);


CREATE TABLE travel_area_review
(
	r_num number NOT NULL,
	u_num number NOT NULL,
	a_num number NOT NULL,
	context varchar2(500),
	PRIMARY KEY (r_num)
);


CREATE TABLE travel_chart
(

);


CREATE TABLE travel_chat
(

);


CREATE TABLE travel_eat
(
	e_num number NOT NULL,
	e_name varchar2(50),
	e_do varchar2(20),
	e_si varchar2(20),
	e_context varchar2(1000),
	PRIMARY KEY (e_num)
);


CREATE TABLE travel_eat_review
(
	r_num number NOT NULL,
	u_num number NOT NULL,
	e_num number NOT NULL,
	context varchar2(500),
	PRIMARY KEY (r_num)
);


CREATE TABLE travel_friend
(
	u_num number NOT NULL,
	f_num number,
	f_name varchar2(20)
);


CREATE TABLE travel_mypage
(
	u_num number NOT NULL,
	file varchar2(100),
	a_num number NOT NULL,
	e_num number NOT NULL,
	s_num number NOT NULL
);


CREATE TABLE travel_notice
(
	n_num number NOT NULL,
	u_num number NOT NULL,
	title varchar2(50),
	category varchar2(50),
	context varchar2(2000),
	PRIMARY KEY (n_num)
);


CREATE TABLE travel_party
(
	p_num number NOT NULL,
	u_num number NOT NULL,
	title varchar2(50),
	context varchar2(1000),
	PRIMARY KEY (p_num)
);


CREATE TABLE travel_qna
(
	q_num number NOT NULL,
	u_num number NOT NULL,
	pass varchar2(50),
	title varchar2(50),
	category varchar2(50),
	context varchar2(2000),
	PRIMARY KEY (q_num)
);


CREATE TABLE travel_sleep
(
	s_num number NOT NULL,
	s_name varchar2(50),
	s_do varchar2(20),
	s_si varchar2(20),
	s_context varchar2(1000),
	PRIMARY KEY (s_num)
);


CREATE TABLE travel_sleep_review
(
	r_num number NOT NULL,
	u_num number NOT NULL,
	s_num number NOT NULL,
	context varchar2(500),
	PRIMARY KEY (r_num)
);


CREATE TABLE travel_user
(
	u_num number NOT NULL,
	u_type varchar2(10),
	u_email varchar2(30),
	u_pass varchar2(50),
	u_name varchar2(20),
	u_birth varchar2(8),
	u_gender varchar2(1),
	u_image varchar2(100),
	u_comment varchar2(100),
	PRIMARY KEY (u_num)
);



/* Create Foreign Keys */

ALTER TABLE travel_area_review
	ADD FOREIGN KEY (a_num)
	REFERENCES travel_area (a_num)
;


ALTER TABLE travel_mypage
	ADD FOREIGN KEY (a_num)
	REFERENCES travel_area (a_num)
;


ALTER TABLE travel_eat_review
	ADD FOREIGN KEY (e_num)
	REFERENCES travel_eat (e_num)
;


ALTER TABLE travel_mypage
	ADD FOREIGN KEY (e_num)
	REFERENCES travel_eat (e_num)
;


ALTER TABLE travel_mypage
	ADD FOREIGN KEY (s_num)
	REFERENCES travel_sleep (s_num)
;


ALTER TABLE travel_sleep_review
	ADD FOREIGN KEY (s_num)
	REFERENCES travel_sleep (s_num)
;


ALTER TABLE travel_area_review
	ADD FOREIGN KEY (u_num)
	REFERENCES travel_user (u_num)
;


ALTER TABLE travel_eat_review
	ADD FOREIGN KEY (u_num)
	REFERENCES travel_user (u_num)
;


ALTER TABLE travel_friend
	ADD FOREIGN KEY (u_num)
	REFERENCES travel_user (u_num)
;


ALTER TABLE travel_mypage
	ADD FOREIGN KEY (u_num)
	REFERENCES travel_user (u_num)
;


ALTER TABLE travel_notice
	ADD FOREIGN KEY (u_num)
	REFERENCES travel_user (u_num)
;


ALTER TABLE travel_party
	ADD FOREIGN KEY (u_num)
	REFERENCES travel_user (u_num)
;


ALTER TABLE travel_qna
	ADD FOREIGN KEY (u_num)
	REFERENCES travel_user (u_num)
;


ALTER TABLE travel_sleep_review
	ADD FOREIGN KEY (u_num)
	REFERENCES travel_user (u_num)
;



