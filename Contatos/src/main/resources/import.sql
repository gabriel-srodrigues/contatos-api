--INSERT OPERADORA 
INSERT INTO operadora(ID, NOME, PRECO) VALUES (1, 'VIVO', 19.90);
INSERT INTO operadora(ID, NOME, PRECO) VALUES (2, 'TIM', 19.90);
INSERT INTO operadora(ID, NOME, PRECO) VALUES (3, 'CLARO', 19.90);
INSERT INTO operadora(ID, NOME, PRECO) VALUES (4, 'NEXT', 19.90);

--INSERT CONTATO 
INSERT INTO contato(ID, ID_PUBLICO, NOME, TELEFONE, DATA, OPERADORA) VALUES (1, "ID_PUB_1S91", "Gabriely SOUZA da paz", "19983438798",STR_TO_DATE( "01/05/2016", "%m/%d/%Y" ), 1);
INSERT INTO contato(ID, ID_PUBLICO, NOME, TELEFONE, DATA, OPERADORA) VALUES (2, "ID_PUB_1S92", "Gabriel dos santos rodrigues", "19983434322",STR_TO_DATE( "01/05/2015", "%m/%d/%Y" ), 3);
INSERT INTO contato(ID, ID_PUBLICO, NOME, TELEFONE, DATA, OPERADORA) VALUES (3, "ID_PUB_1S93", "Rodrigo de rodrigues PERREIRA", "19983433956",STR_TO_DATE( "01/05/2016", "%m/%d/%Y" ), 2);
INSERT INTO contato(ID, ID_PUBLICO, NOME, TELEFONE, DATA, OPERADORA) VALUES (4, "ID_PUB_1S94", "JOÃO de MELO BACCHETTI", "19983431745",STR_TO_DATE( "01/05/2017", "%m/%d/%Y" ), 1);
INSERT INTO contato(ID, ID_PUBLICO, NOME, TELEFONE, DATA, OPERADORA) VALUES (5, "ID_PUB_1S94", "João costela", "19983431645",STR_TO_DATE( "01/05/2018", "%m/%d/%Y" ), 1);


