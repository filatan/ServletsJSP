Use CDs;
Create table CD(
id INTEGER NOT NULL,
Album VARCHAR(300),
Author VARCHAR(300),
Country VARCHAR(300),
Price FLOAT, 
Quantity INTEGER, 
PRIMARY KEY (id)
);
INSERT INTO CD (id, Album, Author, Country, Price, Quantity) VALUES(1, 'Yuan', 'The Guo Brothers', 'China', 4.95 ,0);
INSERT INTO CD (id, Album, Author, Country, Price, Quantity) VALUES(2, 'Drums of Passion', 'Babatune Olatunji', 'Nigeria', 6.95 ,0);


INSERT INTO CD (id, Album, Author, Country, Price, Quantity) VALUES(3,'Kaira', 'Tounami Diabate', 'Mali', 6.95 ,0);
INSERT INTO CD (id, Album, Author, Country, Price, Quantity) VALUES(4,'The Lion is Loose', 'Eliades Ochoa', 'Cuba', 3.95, 0);
INSERT INTO CD (id, Album, Author, Country, Price, Quantity) VALUES(5,'Dance The Devil Away', 'Outback', 'Australia', 4.95, 0);
INSERT INTO CD (id, Album, Author, Country, Price, Quantity) VALUES(6,'fary', 'Mi torito', 'Spain', 6.95 ,0);
