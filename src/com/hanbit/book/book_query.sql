select b.bookname from CUSTOMER c, ORDERS o ,book b where c.custid = o.custid and o.custid = b.bookid and c.name = '김연아'; 

select sum(o.count*b.price) totalprice from CUSTOMER c, ORDERS o , book b where c.custid = o.custid and o.bookid = b.bookid and c.name = '박지성';

select sum(o.count*b.price)*0.1 tax from CUSTOMER c, ORDERS o, book b where c.custid = o.custid and o.bookid = b.bookid and address like '%대한민국%';


올림픽에서 금메달을 딴 선수들은 특별 할인가로 50%에 책값을 공급하고 있습니다. 그런 경우 이 서점의 
총 매출은 얼마인가요(단, 1000원이하는 절삭하세요)?

select trunc(sum((b.price*o.count)+(select sum(b.price*o.count)* 0.5 
from CUSTOMER c, ORDERS o, book b 
where c.custid = o.custid 
and o.bookid = b.bookid 
and name in('장미란','김연아'))),-4)totalprice 
from CUSTOMER c, ORDERS o, book b 
where c.custid = o.custid and o.bookid = b.bookid and name not in('장미란','김연아');

select trunc(sum((b.price*o.count)),-4)
from CUSTOMER c, ORDERS o, book b 
where c.custid = o.custid and o.bookid = b.bookid