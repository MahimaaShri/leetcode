# Write your MySQL query statement below
select firstName,lastname,city,State from Person p left join Address a on p.personid=a.personid;