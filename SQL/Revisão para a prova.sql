CREATE TABLE Cargo
(
	CodCargo INT PRIMARY KEY,
	NomeCargo VARCHAR(50),
	SalarioBase FLOAT
);

INSERT INTO Cargo VALUES (1, 'Analista', 7500);
INSERT INTO Cargo VALUES (2, 'Gerente', 8000);
INSERT INTO Cargo VALUES (3, 'Programador', 5200);
INSERT INTO Cargo VALUES (4, 'Vendedor', 3800);

CREATE TABLE Empregado
(
	Matricula INT PRIMARY KEY,
	NomeEmpregado VARCHAR(50),
	CodCargo INT REFERENCES Cargo(CodCargo),
	AnoContratacao INT,
	Bonus FLOAT
);

INSERT INTO Empregado VALUES (1210, 'José Marcos Silva', 3, 2005, 1);
INSERT INTO Empregado VALUES (1512, 'Ana Maria Bueno', 1, 2006, 1);
INSERT INTO Empregado VALUES (1798, 'Ernesto Sales', 2, 1998, 1.5);
INSERT INTO Empregado VALUES (1809, 'Tatiana Mendes', 3, 2003, 1.1);
INSERT INTO Empregado VALUES (1976, 'Fábio Pereira', 3, 2011, 1.25);

CREATE TABLE Projeto
(
	CodProjeto INT PRIMARY KEY,
	NomeProjeto VARCHAR(50),
	InicioProjeto INT,
	FinalProjeto INT
);

INSERT INTO Projeto VALUES (10, 'E-commerce', 2016, 2017);
INSERT INTO Projeto VALUES (20, 'Business Intelligence', 2017, 2019);
INSERT INTO Projeto VALUES (30, 'Sistema de Vendas', 2018, 2010);

CREATE TABLE Alocacao
(
	CodAlocacao INT PRIMARY KEY,
	CodProjeto INT REFERENCES Projeto(CodProjeto),
	MatriculaEmpregado INT REFERENCES Empregado(Matricula),
	IngressoProjeto INT,
	SaidaProjeto INT
);

INSERT INTO Alocacao VALUES (1, 20, 1512, 2017, 2019);
INSERT INTO Alocacao VALUES (2, 10, 1210, 2016, 2017);
INSERT INTO Alocacao VALUES (3, 10, 1809, 2016, 2018);
INSERT INTO Alocacao VALUES (4, 10, 1512, 2016, 2019);
INSERT INTO Alocacao VALUES (5, 30, 1512, 2018, NULL);
INSERT INTO Alocacao VALUES (6, 20, 1210, 2017, NULL);
INSERT INTO Alocacao VALUES (7, 30, 1976, 2018, NULL);

SELECT * FROM Empregado;
SELECT * FROM Cargo;
SELECT * FROM Projeto;
SELECT * FROM Alocacao;

--O nome e o cargo de cada funcionário.
select NomeEmpregado, NomeCargo
from Empregado e, Cargo c
where e.CodCargo = c.CodCargo

--O nome e o cargo de cada funcionário que ingressou após o ano 2005.

--O nome do funcionário e o nome do projeto em que ele participa.

--O nome e o salário (com o bônus) de todos os empregados, ordenando do 
--empregado que ganha o maior salário para o que ganha o menor salário 
--(Dica: o salário do empregado é calculado pela multiplicação do salário base pelo bônus)

--O nome, ano de início e o ano final de todos os projetos da empresa que ainda têm 
--empregados trabalhando neles (atributo SaidaProjeto não é nulo)

--Os códigos de todos os projetos da empresa que têm ou tiveram algum analista.

--Nome de todos os cargos que não tem funcionários.

--O nome e o cargo de todos os empregados que participam ou participaram de projetos 
--cujo prazo de entrega ainda não expirou

--O nome de todos os programadores que ingressaram em algum projeto após 2017.

-- O nome do projeto e quantidade de empregados que trabalham nele
select NomeProjeto, Count(*) as qtd
from Projeto p, Alocacao a
where p.CodProjeto = a.CodProjeto
and a.SaidaProjeto is null
group by NomeProjeto

-- O nome do cargo e sua media salarial. Mostrar apenas os nomes dos cargos que
-- possuem media salarial superior a 6000
select NomeCargo, Avg(SalarioBase * Bonus) as Salario
from Empregado e, Cargo c
where e.CodCargo = c.CodCargo
group by NomeCargo
having avg(SalarioBase * Bonus) > 6000

--
select NomeProjeto, Sum(SalarioBase * Bonus) as SalarioMensal
from Projeto p, Empregado e, Alocacao a, Cargo c
where e.CodCargo = c.CodCargo
and a.MatriculaEmpregado = e.Matricula
and p.CodProjeto = a.CodProjeto
group by NomeProjeto

--
select NomeEmpregado
from Empregado
where AnoContratacao = (select min(AnoContratacao) from Empregado)

--
select NomeProjeto, avg(SalarioBase * Bonus) as SalarioMensal
from Projeto p, Empregado e, Alocacao a, Cargo c
where e.CodCargo = c.CodCargo
and a.MatriculaEmpregado = e.Matricula
and p.CodProjeto = a.CodProjeto
group by NomeProjeto
having avg(SalarioBase * Bonus) > (select Avg(SalarioBase * Bonus) as Salario
								   from Empregado e, Cargo c
								   where e.CodCargo = c.CodCargo)

-- O nome do projeto que possui a maior quantidade de empregado
select NomeProjeto, COUNT(*) as qtd
from Projeto p, Alocacao a
where p.CodProjeto = a.CodProjeto
group by NomeProjeto
having COUNT(*) = ((select max(qtd) from (select NomeProjeto, COUNT(*) as qtd
										  from Projeto p, Alocacao a
										  where p.CodProjeto = a.CodProjeto
										  group by NomeProjeto)
					as sub))





