CREATE TABLE Subject(
	scode VARCHAR2(15),
	sname VARCHAR2(20),
	PRIMARY KEY(scode)
);
CREATE TABLE Student(
	name VARCHAR2(15) NOT NULL, 	--char Array의 Length는 15 라는 뜻,NULL값은 비허용.
	sno  VARCHAR2(15), 				--char Array의 Length는 15 라는 뜻,NULL값은 비허용.
	scode VARCHAR2(20) NOT NULL, 	--char Array의 Length는 20 라는 뜻,NULL값은 비허용.
	gender VARCHAR2(1),		     	--char Array의 Length는 1 라는 뜻,NULL값은 허용.
	birth DECIMAL,				    --char Array의 Length는 10 라는 뜻,NULL값은 허용, DECIMAL은 10진수라는 뜻.
	PRIMARY KEY(sno),               --PK는 sno로 지정(역할 지정,FM, 가동성 좋음).
	FOREIGN KEY(scode) REFERENCES Subject(scode) --연결고리(부반장)
);

select * from Subject;