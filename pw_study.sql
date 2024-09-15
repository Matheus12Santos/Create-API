create database pw_study;
use pw_study;

CREATE TABLE TBL_DISCIPLINA(
    ID_DISCIPLINA BIGINT primary key identity ,
    TX_NOME VARCHAR(60) NOT NULL
);


CREATE TABLE TBL_MONITOR(
	ID_MONITOR BIGINT PRIMARY KEY IDENTITY,
	TX_NOME VARCHAR(60) NOT NULL,
	TX_FOTO VARCHAR(255) NOT NULL,
	TX_WHATSAPP VARCHAR(11) NOT NULL,
	TX_EMAIL VARCHAR(40) NOT NULL,
	TX_CONTEUDO VARCHAR(1000) NOT NULL,
	ID_DISCIPLINA BIGINT NOT NULL,
	FOREIGN KEY (ID_DISCIPLINA) REFERENCES TBL_DISCIPLINA (ID_DISCIPLINA)
);

CREATE TABLE TBL_DISPONIBILIDADE(
    ID_DISPONIBILIDADE BIGINT  PRIMARY KEY IDENTITY,
    TX_DIA_SEMANA VARCHAR(30) NOT NULL,
    DT_DAS DATETIME NOT NULL,
    DT_ATE DATETIME NOT NULL,
	
);

CREATE TABLE TBL_REL_MONITOR_DISPONIBILIDADE(
	ID_MONITOR BIGINT NOT NULL,
	ID_DISPONIBILIDADE BIGINT NOT NULL,
	FOREIGN KEY (ID_MONITOR) REFERENCES TBL_MONITOR (ID_MONITOR),
	FOREIGN KEY (ID_DISPONIBILIDADE) REFERENCES TBL_DISPONIBILIDADE (ID_DISPONIBILIDADE)
);

INSERT INTO TBL_DISCIPLINA(TX_NOME) VALUES 
('Língua Portuguesa'),
('Matemática'),
('Química');

INSERT INTO TBL_MONITOR(TX_NOME, TX_FOTO, TX_WHATSAPP, TX_EMAIL, TX_CONTEUDO, ID_DISCIPLINA) VALUES 
('João Carlos', 'https://example.com/joao_carlos.jpg', '11987654321', 'joao.carlos@gmail.com', 'Professor de química com foco em preparatório para vestibulares.', 3),
('Maria Silvana', 'https://example.com/maria_silvana.jpg', '1193485967', 'maria.silvan@gmail.com', 'Especialista em literatura com enfoque em análise crítica e produção textual.', 1),
('Felipe Costa', 'https://example.com/felipe_costa.jpg', '11909538895', 'felipe.costa@hotmail.com', 'Engenheiro com experiência em física aplicada e matemática avançada.', 2);