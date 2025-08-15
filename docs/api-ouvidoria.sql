CREATE TABLE ouvidoria(
id_ouvidoria INTEGER NOT NULL AUTO_INCREMENT,
protocolo VARCHAR(45),
descricao VARCHAR(255),
imagem VARCHAR(45),
localizacao VARCHAR(100),
data DATE,
nome_tipo VARCHAR(45),
nome_area VARCHAR(45),
PRIMARY KEY (id_ouvidoria)
);