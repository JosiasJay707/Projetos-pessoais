-- DROP DATABASE db_projetoa3; -- para testes

-- Cria o banco de dados
CREATE DATABASE IF NOT EXISTS db_projetoa3;
USE db_projetoa3;

-- Tabela Produtos
CREATE TABLE Produtos (
    id_codproduto INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(60) NOT NULL,
    refFab VARCHAR(100),
    observacoes TEXT,
    categoria VARCHAR(100),
    unidade VARCHAR(100),
    qtdMin INT,
    qtdMax INT,
    qtdEstoque INT,
    localizacao VARCHAR(10),
    desativado BOOLEAN
);

-- Tabela Usuarios
CREATE TABLE usuarios (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome varchar(60) NOT NULL,
  login varchar(20) NOT NULL,
  senha varchar(20) NOT NULL,
  funcao varchar(30) DEFAULT NULL,
  tentativas INT DEFAULT 0,-- antes (tentativas int(11) DEFAULT 0,) está dando problema
  bloqueado Boolean DEFAULT 0
);


-- Tabela Clientes
CREATE TABLE Clientes (
    idCliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    razaoSocial VARCHAR(70) NOT NULL,
    apelido VARCHAR(70),
    cpfCnpj VARCHAR(20) NOT NULL,
    telefone VARCHAR(20),
    email VARCHAR(70),
    cep VARCHAR(10),
    endereco VARCHAR(100),
    bairro VARCHAR(50),
    numero VARCHAR(10),
    pais VARCHAR(50),
    uf VARCHAR(2),
    cidade VARCHAR(50),
    desativado BOOLEAN NOT NULL
);

-- Tabela Fornecedores
CREATE TABLE Fornecedores (
    idFornecedor INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    razaoSocial VARCHAR(70) NOT NULL,
    apelido VARCHAR(70),
    cpfCnpj VARCHAR(20) NOT NULL,
    telefone VARCHAR(20),
    email VARCHAR(70),
    cep VARCHAR(10),
    endereco VARCHAR(100),
    bairro VARCHAR(50),
    numero VARCHAR(10),
    pais VARCHAR(50),
    uf VARCHAR(2),
    cidade VARCHAR(50),
    desativado BOOLEAN NOT NULL
);

-- Tabela Movimentacao
CREATE TABLE Movimentacao (
    idMovimentacao INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    
    tipoMovimentacao TINYINT NOT NULL COMMENT '1 = entrada, 2 = saída',
    dataMovimentacao DATE NOT NULL,
    codProduto INT NOT NULL,
    qtdMovimentada INT NOT NULL,
    idFornecedor INT NULL,
    idCliente INT NULL,
    numNFe VARCHAR(50) NOT NULL,
    
    CONSTRAINT fk_produto FOREIGN KEY (codProduto) REFERENCES Produtos(id_codproduto),
    CONSTRAINT fk_fornecedor FOREIGN KEY (idFornecedor) REFERENCES Fornecedores(idFornecedor),
    CONSTRAINT fk_cliente FOREIGN KEY (idCliente) REFERENCES Clientes(idCliente)
);

-- Script para inserção dos dados das tabelas:
USE db_projetoa3;

INSERT INTO Produtos (descricao, refFab, observacoes, categoria, unidade, qtdMin, qtdMax, qtdEstoque, localizacao, desativado) VALUES
('VIDRO TEMPERADO 8MM', 'VT8-001', 'VIDRO PARA JANELAS', 'Vidros', 'M²', 10, 100, 0, 'A1C2M3N2V3', FALSE),
('VIDRO LAMINADO 10MM', 'VL10-002', 'VIDRO LAMINADO PARA PORTAS', 'Vidros', 'M²', 5, 50, 0, 'A1C3M1N1V4', FALSE),
('FERRAGEM PARA PORTA', 'FP-003', 'CONJUNTO PARA PORTA DE ALUMÍNIO', 'Ferragens', 'PC', 20, 200, 0, 'A2C1M4N3V2', FALSE),
('PARAFUSO 3X20MM', 'P320-004', 'PARAFUSO PARA FIXAÇÃO', 'Ferragens', 'PC', 100, 1000, 0, 'A2C4M2N1V5', FALSE),
('PERFIL DE ALUMÍNIO 2M', 'PA2-005', 'PERFIL PARA ESQUADRIAS', 'Aluminios', 'UN', 15, 150, 0, 'A3C2M5N2V1', FALSE),
('DOBRADIÇA INOX', 'DI-007', 'DOBRADIÇA PARA PORTAS', 'Ferragens', 'PC', 30, 300, 0, 'A2C5M1N2V3', FALSE),
('TRINCO PARA JANELA', 'TJ-008', 'TRINCO DE SEGURANÇA', 'Ferragens', 'PC', 25, 250, 0, 'A2C2M4N1V2', FALSE),
('DOBRADIÇA SIMPLES', 'DS-015', 'DOBRADIÇA PARA JANELAS', 'Ferragens', 'PC', 40, 400, 0, 'A2C4M3N2V1', FALSE),
('PERFIL DE ALUMÍNIO 4M', 'PA4-018', 'PERFIL PARA GRANDES ESTRUTURAS', 'Aluminios', 'UN', 5, 50, 0, 'A3C4M3N2V3', FALSE);

-- Inserir 3 usuários

INSERT INTO usuarios (nome, login, senha, funcao, tentativas, bloqueado) VALUES
('Carlos Almeida', 'admin', '1234', 'administrador', 0, 0),
('Lucas Ramos', 'lucas22', '1234', 'Estoquista', 5, 0);

-- Inserir 6 Clientes (sem nomes repetidos)
INSERT INTO Clientes (razaoSocial, apelido, cpfCnpj, telefone, email, cep, endereco, bairro, numero, pais, uf, cidade, desativado) VALUES
('João Pedro Silva', NULL, '12345678000190', '75 3333-1234', 'joao.pedro@email.com', '44000-000', 'Rua das Flores', 'Bairro Jardim das Acácias', '100', 'Brasil', 'BA', 'Feira de Santana', FALSE),
('Flávia Santana', NULL, '12345678000271', '75 3333-2345', 'flavia.santana@email.com', '44000-001', 'Rua das Palmeiras', 'Bairro Vila Nova', '101', 'Brasil', 'BA', 'Feira de Santana', FALSE),
('Lucas Martins', NULL, '22345678000190', '11 3333-2234', 'lucas.martins@email.com', '01000-000', 'Av. Paulista', 'Bairro Bela Vista', '200', 'Brasil', 'SP', 'São Paulo', FALSE),
('Fernanda Lima', NULL, '22345678000271', '21 3333-3345', 'fernanda.lima@email.com', '20000-000', 'Rua das Laranjeiras', 'Bairro Botafogo', '201', 'Brasil', 'RJ', 'Rio de Janeiro', FALSE),
('Empresa Vidro Forte', 'Vidro Forte Ltda', '22345678000352', '31 3333-4456', 'contato@vidroforte.com', '30000-000', 'Rua Ouro Preto', 'Bairro Savassi', '202', 'Brasil', 'MG', 'Belo Horizonte', FALSE),
('Rodrigues Ferragens', NULL, '22345678000433', '51 3333-5567', 'rodrigues.ferragens@email.com', '90000-000', 'Av. Ipiranga', 'Bairro Moinhos de Vento', '203', 'Brasil', 'RS', 'Porto Alegre', FALSE);

-- Inserir 5 Fornecedores (sem nomes repetidos)
INSERT INTO Fornecedores (razaoSocial, apelido, cpfCnpj, telefone, email, cep, endereco, bairro, numero, pais, uf, cidade, desativado) VALUES
('AluMax', 'AluMax Alumínios Ltda', '32345678000190', '75 3333-2234', 'contato@alumax.com', '44010-000', 'Rua Alfa', 'Bairro Jardim das Acácias', '110', 'Brasil', 'BA', 'Feira de Santana', FALSE),
('Ferragens Vila Nova', 'Vila Nova Ferragens ME', '32345678000271', '75 3333-3345', 'vendas@vilanovaferragens.com', '44010-001', 'Rua Beta', 'Bairro Vila Nova', '111', 'Brasil', 'BA', 'Feira de Santana', FALSE),
('Mariana Alumínios', 'Mariana Alumínios ME', '32345678000695', '75 3333-7789', 'contato@marianaaluminios.com', '44010-005', 'Rua Épsilon', 'Bairro Santo Antônio', '115', 'Brasil', 'BA', 'Feira de Santana', FALSE),
('Lucas Alumínios', 'Lucas Alumínios ME', '42345678001190', '11 3333-2234', 'lucas.aluminios@fornecedores.com', '01010-000', 'Av. Paulista', 'Bairro Bela Vista', '210', 'Brasil', 'SP', 'São Paulo', FALSE),
('Fernanda Ferragens', 'Fernanda Ferragens ME', '42345678001271', '21 3333-3345', 'fernanda.ferragens@fornecedores.com', '20010-000', 'Rua das Laranjeiras', 'Bairro Botafogo', '211', 'Brasil', 'RJ', 'Rio de Janeiro', FALSE);

-- 12 inserções de movimentações
INSERT INTO Movimentacao (tipoMovimentacao, dataMovimentacao, codProduto, qtdMovimentada, idFornecedor, idCliente, numNFe) VALUES
(1, '2025-06-01', 1, 20, 1, NULL, '1001'),
(2, '2025-06-02', 1, 5, NULL, 1, '1002');