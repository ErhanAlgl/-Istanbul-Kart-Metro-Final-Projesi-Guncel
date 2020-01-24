CREATE DATABASE istanbulkart;

USE istanbulkart;

CREATE TABLE turnike(
  turnike_id INT PRIMARY KEY,
  giris DATETIME,
  cikis DATETIME,
  iade INT
);

CREATE TABLE yolcu(
	yolcu_id INT PRIMARY KEY,
	yolcu_adi VARCHAR(40),
	yolcu_soyadi VARCHAR(40),
    yolcu_tipi VARCHAR(40),
    cinsiyet VARCHAR(10),
    dogum DATE
    );

CREATE TABLE kart(
	kart_id INT PRIMARY KEY,
    bakiye INT,
    kart_turu VARCHAR(20)      
);

CREATE TABLE istasyon(
	istasyon_id INT PRIMARY KEY,
    istasyon_adi VARCHAR(40)
);

CREATE TABLE seyehat(
	seyehat_id INT PRIMARY KEY,
	ucret INT,
    turnike_id INT,
    yolcu_id INT,
    kart_id INT,
    istasyon_id INT,
    FOREIGN KEY (turnike_id) REFERENCES turnike(turnike_id),
    FOREIGN KEY (yolcu_id) REFERENCES yolcu(yolcu_id),
    FOREIGN KEY (kart_id) REFERENCES kart(kart_id),
	FOREIGN KEY (istasyon_id) REFERENCES istasyon(istasyon_id)
);
