CREATE DATABASE Productos;

CREATE TABLE `productos`.`producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(100) NOT NULL,
  `Marca` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idProducto`))
COMMENT = 'Tabla que aloja los productos que se venderan en la aplicacion.';

CREATE TABLE `productos`.`categoria` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT,
  `IdProducto` INT NOT NULL,
  `NombreCategoria` VARCHAR(100) NULL,
  PRIMARY KEY (`idCategoria`));

CREATE TABLE `productos`.`stock` (
  `idstock` INT NOT NULL AUTO_INCREMENT,
  `IdProducto` INT NOT NULL,
  `Cantidad` INT NOT NULL,
  PRIMARY KEY (`idstock`));

CREATE TABLE `productos`.`precio` (
  `idprecio` INT NOT NULL AUTO_INCREMENT,
  `IdProducto` INT NOT NULL,
  `Valor` INT NOT NULL,
  PRIMARY KEY (`idprecio`));

ALTER TABLE precio 
ADD FOREIGN KEY (IdProducto) REFERENCES producto (idProducto);

ALTER TABLE categoria 
ADD FOREIGN KEY (IdProducto) REFERENCES producto (idProducto);

ALTER TABLE stock 
ADD FOREIGN KEY (IdProducto) REFERENCES producto (idProducto);


--Insercion de datos

INSERT INTO producto (Nombre, Marca) 
VALUES ('Cuaderno cuadriculado','Norma')
,('Mouse Optico','Hp')
,('Audifonos','Sony')
,('Audifonos','Huawei')
,('Boligrafo X 12 Negro','Bic')
,('Boligrafo X 12 Rojo','Bic')
,('Cubo Rubik 3x3','Roxenda')
,('Cubo Rubik 6x6','Roxenda')
,('Cubo Rubik 4x4','Roxenda')
,('Cubo Rubik 5x5','Roxenda'); 

INSERT INTO stock (IdProducto, cantidad )
VALUES (1,150)
,(2,25)
,(3,10)
,(4,83)
,(5,100)
,(6,92)
,(7,123)
,(8,80)
,(9,96)
,(10,35);

INSERT INTO precio (IdProducto, valor)
VALUES (1,10000)
,(2,120000)
,(3,150000)
,(4,125000)
,(5,10000)
,(6,10000)
,(7,80000)
,(8,65000)
,(9,82000)
,(10,93000);

INSERT INTO categoria (IdProducto,  NombreCategoria) 
VALUES (1,'Cuadernos')
,(2,'Accesorios PC')
,(3,'Accesorios PC')
,(4,'Accesorios Celulares')
,(5,'Boligrafos')
,(6,'Boligrafos')
,(7,'Juegos Didacticos')
,(8,'RJuegos Didacticos')
,(9,'Juegos Didacticos')
,(10,'Juegos Didacticos'); 
