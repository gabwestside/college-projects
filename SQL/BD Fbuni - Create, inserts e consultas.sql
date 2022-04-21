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

INSERT INTO Empregado VALUES (1, 'Gabriel', 4.000, 6, 1);
INSERT INTO Empregado VALUES (2, 'Daniel', 10.000, 8, 3);
INSERT INTO Empregado VALUES (3, 'Glauber', 2.000, 2, 4);
INSERT INTO Empregado VALUES (4, 'Enivaldo', 1.400, 1, 1);
INSERT INTO Empregado VALUES (5, 'Josue', 3.000, 1, 1);
INSERT INTO Empregado VALUES (6, 'Enivaldo', 1.400, 1, 1);
INSERT INTO Empregado VALUES (7, 'Enivaldo', 1.400, 1, 1);

UPDATE Empregado 
SET nome_empregado = 'Chris'
WHERE cod_empregado = 6
UPDATE Empregado SET nome_empregado = 'Estagiario'
WHERE cod_empregado = 1
UPDATE Empregado SET nome_empregado = 'Estagiario'
WHERE cod_empregado = 1
UPDATE Empregado SET nome_empregado = 'Estagiario'
WHERE cod_empregado = 1

select * from Empregado order by 1 asc

--1) Mostrar o nome de todos os empregados cujo salário está 
--entre 3500 e 7800.
select nome_empregado 
from Empregado
where salario >= 3.500
and salario <= 7.800

--2) Mostrar o nome do empregado, seu salário e o nome do 
--departamento dos empregados cujo salário é inferior a 5000.
select nome_empregado, salario, nome_depa 
from Empregado
where salario >= 3.500
and salario <= 7.800
