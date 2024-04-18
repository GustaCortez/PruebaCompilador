//Julio Daniel Sincal Aroche -- Carné: 0907-21-15846
grammar select;
start:	select (distinct)?('*'| ID (as ID)?(',' ID (as ID)?)*)
from ID (as ID)? (',' ID (as ID)?)*
(joinClause (ID (as ID)? on ID '.' ID igual ID '.' ID)
    (joinClause (ID (as ID)? on ID '.' ID igual ID '.' ID) )*
    )?
(where ( (ID( '.' ID)?) (OPER_COND|igual) (NUMERO|ID|LITERAL) )
    ((and|or)  ( (ID('.' ID)?) (OPER_COND|igual)) (NUMERO|ID|LITERAL) )*
    )?
(orderBy ID (order)? (',' ID (order)?)* )?
(limit NUMERO)? EOF;
select: 'select'|'SELECT'|'Select';
from: 'from'|'FROM';
as: 'as'|'AS';
joinClause: 'INNER JOIN'|'inner join'|'LEFT JOIN'|'left join';
on: 'on'|'ON';
and: 'and'|'AND';
or: 'or'|'OR';
where: 'where'|'WHERE';
orderBy: 'order by'|'ORDER BY';
order: 'asc'|'ASC'|'desc'|'DESC';
igual: '=';
distinct: 'distinct'|'DISTINCT';
limit: 'LIMIT';

ID: ([a-zA-Z]|UNDERSCORE)(LETTER|UNDERSCORE|DIGIT)* ;
COND: ID OPER_COND (NUMERO|ID|LITERAL);
NUMERO: DIGIT+;
LITERAL: '"'(LETTER|DIGIT)+'"';
OPER_COND: Lt|Gt|LtEqual|GtEqual;


 LETTER:[a-zA-Z];
fragment DIGIT: [0-9];
fragment UNDERSCORE: '_';
fragment Lt         : '<';
fragment Gt         : '>';
fragment LtEqual    : '<=';
fragment GtEqual   : '>=';

NEWLINE : [ \r\n\t]+ -> skip;