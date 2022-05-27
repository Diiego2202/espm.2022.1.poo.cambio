CREATE TABLE cotacao (
    id_cotacao varchar(40) not null,
    id_moeda varchar(64) not null,
    dt_data date not null,
    vr_valor decimal(14,4),
    PRIMARY KEY pk_cotacao (id_cotacao)
);