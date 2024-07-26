CREATE TABLE Livros (
                        id SERIAL PRIMARY KEY,
                        nome VARCHAR(255),
                        categoria VARCHAR(255),
                        QUANTIDADE INTEGER
);

INSERT INTO Livros (nome, categoria, QUANTIDADE)
VALUES ('Memórias Póstumas de Brás Cubas', 'Literatura Clássica', 1),
       ('Essencialismo', 'Auto Ajuda', 3),
       ('Crime e Castigo', 'Literatura Clássica', 2),
       ('A República', 'Filosofia', 5),
       ('1984', 'Sociologia', 8)
      ;
