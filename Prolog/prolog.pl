:-dynamic homem/1.
:-dynamic genitor/2.

:-dynamic sala/6.

start() :- write('Digite o valor de X:'),nl,
    	  read(X),nl,
    	  write(X),nl.    
////

camarote(jade).
camarote(arthur).
camarote(linn).
camarote(scooby).
pipoca(vini).
pipoca(barbara).
pipoca(eli).
pipoca(eslo).

union(C, P) :-
    camarote(C), pipoca(P).

////

mulher(pam).
mulher(ann).
mulher(liz).
mulher(pat).

homem(tom).
homem(bob).
homem(jim).

genitor(pam, bob).
genitor(tom, bob).
genitor(tom, liz).
genitor(bob, ann).
genitor(bob, pat).
genitor(pat, jim).

son(X,Y) :- genitor(Y,X).

mother(X,Y) :- genitor(X,Y), mulher(X).

grandpa(X,Z) :- genitor(X,Y), genitor(Y,Z).

////

animal(urso).
animal(peixe).
animal(peixinho).
animal(lince).
animal(raposa).
animal(coelho).
animal(veado).
animal(guaxinim).

planta(alga).
planta(grama).

come(urso, peixe).
come(lince, veado).
come(urso, raposa).
come(urso, veado).
come(peixe, peixinho).
come(peixinho, alga).
come(guaxinim, peixe).
come(raposa, coelho).
come(coelho, grama).
come(veado, grama).
come(urso, guaxinim).

////


aluno(joao, calculo).
aluno(maria, calculo).
aluno(joel, programacao).
aluno(joel, estrutura).

frequenta(joao, puc).
frequenta(maria, puc).
frequenta(joel, ufrj).

professor(carlos, calculo).
professor(ana_paula, estrutura).
professor(pedro, programacao).

funcionario(pedro, ufrj).
funcionario(ana_paula, puc).
funcionario(carlos, puc).

are_students_for_teacher(A,X) :- professor(X,Materias), aluno(A,Materias).

associated_students(Student,College) :- frequenta(Student,College).

associated_teachers(Person,College) :- funcionario(Person,College).

associates(Person,College) :- associated_students(Person,College);
							   associated_teachers(Person,College).

states(mg, 'Belo Horizonte').
states(sp, 'São Paulo').
states(rj,'Rio de Janeiro').
states(es, 'Vitório').

capital(State, Capital) :- states(State, Capital).

////

doa(a, a).
doa(a, ab).
doa(b, b).
doa(b, ab).
doa(ab, ab).
doa(o, a).
doa(o,b).
doa(o, ab).
doa(o, o).

recebe(a, a).
recebe(a, o) .
recebe(b,b)
recebe(b, o).
recebe(ab, a).
recebe(ab, b).
recebe(ab, ab).
recebe(ab, o).
recebe(o,c).

////

%sala(num, dia,inicio,fim,discipl,tipo).
sala(cp1103, seg, 10, 13, aaa, p).
sala(cp2301, ter, 10, 11, aaa, t).
sala(di011, sab, 12, 10, xxx, p). %com erro
sala(cp3204, dom, 8, 10, zzz, p).
sala(di011, sex, 14, 16, xxx, p).
sala(cp204, sab, 15, 17, zzz, tp).
sala(di011, qui, 14, 13, bbb, tp). %com erro
sala(di104, qui, 9, 10, aaa, tp).
sala(dial, dom, 14, 16, bbb, t).
sala(cp1220, sab, 14, 18, sss, p).