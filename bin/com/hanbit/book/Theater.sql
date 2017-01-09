--극장: Multiplex
--극장번호 : multi_no / decimal
--극장이름 : multi_name  
--위치 : loc

--상영관 : Theater
--극장번호 : multi_no / decimal
--상영관번호 : theater_tno / decimal
--영화제목 : title
--가격 : price / decimal
--좌석수 : seat_count / decimal

--예약 : Reservation
--고객번호 : res_seq / decimal
--날짜 : res_date / date
--고객번호 : cust_no / decimal
--좌석번호 : sear_no / decimal

--고객 : Consumer
--고객번호 : con_no / decimal
--이름 : name
--주소 : addr 
DROP SEQUENCE multi_seq;
DROP SEQUENCE theater_no;
DROP SEQUENCE res_seq;
DROP TABLE Reservation;
DROP TABLE Consumer;
DROP TABLE Theater;
DROP TABLE Multiplex;
CREATE SEQUENCE multi_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 CREATE SEQUENCE theater_no
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 CREATE SEQUENCE res_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
CREATE TABLE Multiplex(
	multi_seq DECIMAL, 
	multi_name VARCHAR2(15),
	loc VARCHAR2(15),
	PRIMARY KEY(multi_seq)
);
CREATE TABLE Theater(
	theater_no DECIMAL ,
	multi_seq DECIMAL ,
	title VARCHAR2(10),
	price DECIMAL,
	seat_count DECIMAL,
	PRIMARY KEY(theater_no),
	FOREIGN KEY(multi_seq) REFERENCES multiplex(multi_seq)
);
ALTER TABLE Theater RENAME COLUMN theater_no TO theater_no;
SELECT * FROM Theater;
CREATE TABLE Consumer(
	con_no DECIMAL NOT NULL,
	name VARCHAR2(10),
	addr VARCHAR2(30),
	PRIMARY KEY(con_no)
);
CREATE TABLE Reservation(
	res_seq DECIMAL,
	multi_seq DECIMAL NOT NULL,
	theater_no DECIMAL NOT NULL,
	con_no DECIMAL NOT NULL,
	seat_no VARCHAR2(3) NOT NULL,
	res_date DATE,
	PRIMARY KEY(res_seq),
	FOREIGN KEY(multi_seq) REFERENCES Multiplex(multi_seq),
	FOREIGN KEY(theater_no) REFERENCES Theater(theater_no),
	FOREIGN KEY(con_no) REFERENCES Consumer(con_no)
);
--ALTER TABLE Reservation MODIFY res_date VARCHAR2(10);

ALTER TABLE Reservation RENAME COLUMN theater_seq TO theater_no;
ALTER TABLE Reservation MODIFY seat_no VARCHAR2(5);
select * from Reservation;

INSERT INTO Multiplex(multi_seq, multi_name, loc)
VALUES(multi_seq.nextval,'롯데','잠실');
select * from Multiplex;
INSERT INTO Multiplex(multi_seq, multi_name, loc)
VALUES(multi_seq.nextval,'롯데','신촌');
INSERT INTO Theater(theater_no,multi_seq, title, price, seat_count)
VALUES(1,1000,'마스터',10000,100);
INSERT INTO Theater(theater_no,multi_seq, title, price, seat_count)
VALUES(2,1000,'로그원',12000,200);

INSERT INTO Theater(theater_no,multi_seq, title, price, seat_count)
VALUES(1,1000,'마스터',10000,100);
INSERT INTO Theater(theater_no,multi_seq, title, price, seat_count)
VALUES(2,1000,'로그원',12000,200);
--update Theater set seat_count = 100 where theater_no = 1;

INSERT INTO Consumer(con_no, name, addr)
VALUES(12345,'홍길동','면목동');
INSERT INTO Consumer(con_no, name, addr)
VALUES(67890,'이순신','대치동');

INSERT INTO Reservation(res_seq, multi_seq,theater_no,con_no,seat_no,res_date)
VALUES(res_seq.nextval,1000,1,12345,'F-10','2017-01-07');
INSERT INTO Reservation(res_seq, multi_seq,theater_no,con_no,seat_no,res_date)
VALUES(res_seq.nextval,1000,1,67890,'G-10','2017-01-07');
select * from Multiplex;
select * from Theater;
select * from Consumer;
select * from Reservation;

CREATE VIEW Reservation_View
AS
SELECT r.res_seq,
r.res_date,
m.multi_seq ,
t.theater_no ,
c.con_no con_no,
r.seat_no,
m.multi_name,
m.loc,
t.title,
t.price,
t.seat_count ,
c.name,
c.addr  
FROM Reservation r RIGHT OUTER JOIN Consumer c on r.con_no = c.con_no 
RIGHT OUTER JOIN Theater t ON r.theater_no = t.theater_no 
RIGHT OUTER JOIN Multiplex m ON r.multi_seq = m.multi_seq
WHERE res_seq IS NOT NULL;

SELECT * FROM Reservation_View;

select * from doctor;
DROP TABLE doctor;