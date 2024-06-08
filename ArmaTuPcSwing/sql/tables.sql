CREATE TABLE rgb(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tiene BOOLEAN NOT NULL
);

CREATE TABLE capacidad(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    gb INT NOT NULL
);

CREATE TABLE color(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    color VARCHAR(20) NOT NULL
);

CREATE TABLE marcaCpu(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE tipoCooler(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(10)
);

CREATE TABLE ramDDR(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ddr INT NOT NULL
);

CREATE TABLE ramMHZ(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    mhz INT NOT NULL
);

CREATE TABLE gpuGDDR(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    gddr VARCHAR(5) NOT NULL
);

CREATE TABLE ssdVelocidad(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    velocidad INT NOT NULL
);

CREATE TABLE fuenteWatts(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    watts INT NOT NULL
);

CREATE TABLE monitorPulgadas(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    pulgadas DOUBLE NOT NULL
);

CREATE TABLE monitorHZ(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    hz INT
);

CREATE TABLE mouseDPI(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    dpi INT
);

CREATE TABLE procesador(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    marca int NOT NULL,
    FOREIGN KEY(marca) REFERENCES marcaCpu(id)
);

CREATE TABLE mother(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100)
);

CREATE TABLE cooler(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    tipo INT NOT NULL,
    FOREIGN KEY(tipo) REFERENCES tipoCooler(id)
);

CREATE TABLE ram(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    rgb INT NOT NULL,
    capacidad INT NOT NULL,
    ddr INT NOT NULL,
    mhz INT NOT NULL,
    FOREIGN KEY(rgb) REFERENCES rgb(id),
    FOREIGN KEY(capacidad) REFERENCES capacidad(id),
    FOREIGN KEY(ddr) REFERENCES ramDDR(id),
    FOREIGN KEY(mhz) REFERENCES ramMHZ(id)
);

CREATE TABLE gpu(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    rgb INT NOT NULL,
    capacidad INT NOT NULL,
    gddr INT NOT NULL,
    FOREIGN KEY(rgb) REFERENCES rgb(id),
    FOREIGN KEY(capacidad) REFERENCES capacidad(id),
    FOREIGN KEY(gddr) REFERENCES gpuGDDR(id)
);

CREATE TABLE ssd(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    capacidad INT NOT NULL,
    velocidad INT NOT NULL,
    FOREIGN KEY(capacidad) REFERENCES capacidad(id),
    FOREIGN KEY(velocidad) REFERENCES ssdVelocidad(id)
);

CREATE TABLE hdd(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    capacidad INT NOT NULL,
    velocidad INT NOT NULL,
    FOREIGN KEY(capacidad) REFERENCES capacidad(id)
);

CREATE TABLE fuente(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    watts INT NOT NULL,
    FOREIGN KEY(watts) REFERENCES fuenteWatts(id)
);

CREATE TABLE gabinete(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    color INT NOT NULL,
    rgb INT NOT NULL,
    FOREIGN KEY(rgb) REFERENCES rgb(id),
    FOREIGN KEY(color) REFERENCES color(id)
);

CREATE TABLE monitor(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    pulgadas INT NOT NULL,
    hz INT,
    FOREIGN KEY(pulgadas) REFERENCES monitorPulgadas(id),
    FOREIGN KEY(hz) REFERENCES monitorHZ(id)
);

CREATE TABLE auriculares(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    rgb INT NOT NULL,
    color INT NOT NULL,
    FOREIGN KEY(rgb) REFERENCES rgb(id),
    FOREIGN KEY(color) REFERENCES color(id)
);

CREATE TABLE mousePad(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    rgb INT NOT NULL,
    FOREIGN KEY(rgb) REFERENCES rgb(id)
);

CREATE TABLE mouse(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    rgb INT NOT NULL,
    dpi INT,
    color INT NOT NULL,
    FOREIGN KEY(rgb) REFERENCES rgb(id),
    FOREIGN KEY(dpi) REFERENCES mouseDPI(id),
    FOREIGN KEY(color) REFERENCES color(id)
);

CREATE TABLE teclado(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(300) NOT NULL,
    precio DOUBLE NOT NULL,
    img VARCHAR(100),
    rgb INT NOT NULL,
    color INT NOT NULL,
    FOREIGN KEY(rgb) REFERENCES rgb(id),
    FOREIGN KEY(color) REFERENCES color(id)
);

CREATE TABLE users(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(150) NOT NULL,
    pass VARCHAR(100) NOT NULL,
    isadmin BOOLEAN NOT NULL
);