CREATE TABLE ouvidoria(
id_ouvidoria INTEGER NOT NULL AUTO_INCREMENT,
protocolo VARCHAR(45),
descricao VARCHAR(255),
midia VARCHAR(45),
localizacao VARCHAR(100),
data DATE,
nome_tipo VARCHAR(45),
nome_area VARCHAR(45),
PRIMARY KEY (id_ouvidoria)
);


--Teste Postman
{
  "nome_tipo": "DENUNCIA",
  "nome_area": "INFRAESTRUTURA",
  "descricao": "Buraco",
  "localizacao": "Rua Exemplo, 123",
  "midia": "foto.jpg"
}
{
  "nome_tipo": "RECLAMACAO",
  "nome_area": "SAUDE",
  "descricao": "Falta de remédio nos postos de saude",
  "localizacao": "Rua Exemplo, 123",
  "midia": "foto.jpg"
}
{
    "nome_tipo": "DENUNCIA",
    "nome_area": "SAUDE",
    "descricao": "A rua principal está sem iluminação.",
    "localizacao": "Rua das Flores, 123",
    "midia": "foto_rua.jpg"
}
