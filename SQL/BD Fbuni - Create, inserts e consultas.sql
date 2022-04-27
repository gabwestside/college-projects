create table Departamento (
	cod_departamento int PRIMARY KEY,
	nome_departamento varchar(50) not null unique
)

create table Cargo (
	cod_cargo int PRIMARY KEY,
	nome_cargo varchar(50) not null unique
)

create table Empregado (
	cod_empregado int PRIMARY KEY,
	nome_empregado varchar(50) not null unique,
	salario decimal(10,2),
	cod_cargo int references Cargo(cod_cargo),
	cod_departamento int references Departamento(cod_departamento)
)

drop table Empregado

select * from Departamento

INSERT INTO Departamento VALUES (1, 'Cobrança');
INSERT INTO Departamento VALUES (2, 'Integração');
INSERT INTO Departamento VALUES (3, 'Pagadoria');
INSERT INTO Departamento VALUES (4, 'Pix');

INSERT INTO Cargo VALUES (1, 'Cobrança');
INSERT INTO Cargo VALUES (2, 'Integração');
INSERT INTO Cargo VALUES (3, 'Pagadoria');
INSERT INTO Cargo VALUES (4, 'Pix');

UPDATE Cargo SET nome_cargo = 'Estagiario'
WHERE cod_cargo = 1
UPDATE Cargo SET nome_cargo = 'Trainee'
WHERE cod_cargo = 2
UPDATE Cargo SET nome_cargo = 'Dev Junior'
WHERE cod_cargo = 3
UPDATE Cargo SET nome_cargo = 'Dev Pleno'
WHERE cod_cargo = 4

select * from Cargo order by 1 asc

INSERT INTO Cargo VALUES (5, 'Dev Senior');
INSERT INTO Cargo VALUES (6, 'Tech Lead');
INSERT INTO Cargo VALUES (7, 'Arquiteto');
INSERT INTO Cargo VALUES (8, 'CTO');
INSERT INTO fbuni..Cargo VALUES (9, 'Manager');
INSERT INTO fbuni..Cargo VALUES (10, 'CEO');

INSERT INTO fbuni..Empregado VALUES (1, 'Gabriel', 4.000, 6, 1);
INSERT INTO fbuni..Empregado VALUES (2, 'Daniel', 10.000, 8, 3);
INSERT INTO fbuni..Empregado VALUES (3, 'Glauber', 2.000, 2, 4);
INSERT INTO fbuni..Empregado VALUES (4, 'Enivaldo', 1.400, 1, 1);
INSERT INTO fbuni..Empregado VALUES (5, 'Josue', 3.000, 1, 1);
INSERT INTO fbuni..Empregado VALUES (6, 'Chris', 4000, 7, 3);
INSERT INTO fbuni..Empregado VALUES (7, 'Nicholas', 2000, 2, 1);
INSERT INTO fbuni..Empregado VALUES (8, 'Erika', 1400, 1, 2);
INSERT INTO fbuni..Empregado VALUES (9, 'Jonathan', 15000, 9, null);
INSERT INTO fbuni..Empregado VALUES (10, 'Osmar', 1200, 4, 1);

select * from fbuni..Departamento order by 1 asc
select * from fbuni..Cargo order by 1 asc
select * from fbuni..Empregado order by salario desc

UPDATE fbuni..Empregado 
SET salario = 4000
WHERE cod_empregado = 1
UPDATE fbuni..Empregado 
SET salario = 10000
WHERE cod_empregado = 2
UPDATE fbuni..Empregado 
SET salario = 2000
WHERE cod_empregado = 3
UPDATE fbuni..Empregado 
SET salario = 1400
WHERE cod_empregado = 4
UPDATE fbuni..Empregado 
SET salario = 3000
WHERE cod_empregado = 5
update fbuni..Empregado
set cod_cargo = 4
where nome_empregado = 'Josue'

update fbuni..Empregado
set cod_cargo = 3
where nome_empregado = 'Nicholas'

update fbuni..Empregado
set salario = 10000
where nome_empregado = 'Osmar'

update fbuni..Empregado
set cod_cargo = 5, salario = 6000
where nome_empregado = 'Daniel'

select * from fbuni..Empregado order by 1 asc

--1) Mostrar o nome de todos os empregados cujo salário está 
--entre 3500 e 7800.
select nome_empregado 
from fbuni..Empregado
where salario between 3.500 and 7.800

--2) Mostrar o nome do empregado, seu salário e o nome do 
--departamento dos empregados cujo salário é inferior a 5000.
select e.nome_empregado, e.salario, d.nome_departamento
From fbuni..Empregado e, fbuni..Departamento d
where e.cod_departamento = d.cod_departamento
and e.salario > 5000

--3) Mostrar o nome dos empregados com seus respectivos 
--nomes de departamento e cargo.
SELECT e.nome_empregado, d.nome_departamento, c.nome_cargo
FROM fbuni..Empregado e, fbuni..Departamento d, fbuni..Cargo c
where e.cod_departamento = d.cod_departamento
and e.cod_cargo = c.cod_cargo

--4) Mostrar o nome dos cargos que não tem empregados.
SELECT c.nome_cargo
FROM fbuni..Cargo c left JOIN fbuni..Empregado e 
ON c.cod_cargo = e.cod_cargo
where e.cod_cargo is null

select c.nome_cargo, e.nome_empregado
from fbuni..Empregado e right join fbuni..Cargo c
on e.cod_cargo = c.cod_cargo
order by nome_empregado asc

select * from fbuni..Empregado order by salario desc

--5) Mostrar o nome dos empregados que ganham mais de
--R$ 6000 e que possuem o cargo de 'Dev Junior' no
--departamento de 'Pix'
select nome_empregado
from fbuni..Empregado e 
inner join fbuni..Departamento d on d.cod_departamento = e.cod_departamento
inner join fbuni..Cargo c on e.cod_cargo = c.cod_cargo
where e.salario > 6000
and e.cod_cargo = 4
and e.cod_departamento = 1