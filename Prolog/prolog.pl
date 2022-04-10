start() :- write('Digite o valor de X:'),nl,
    	  read(X),nl,
    	  write(X),nl.    
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