CREATE TABLE employee
(
    id         INT          NOT NULL PRIMARY KEY,
    name       VARCHAR(100) NOT NULL,
    company_id INT          NOT NULL REFERENCES company
);

insert into employee values (1,'Brad',101);
