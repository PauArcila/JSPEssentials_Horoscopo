CREATE DATABASE HOROSCOPO;

CREATE TABLE HOROSCOPO(
idHoroscopo int,
signo varchar(50),
descripcion varchar(500),
url VARCHAR(200),
primary key (idHoroscopo)
);

CREATE TABLE USUARIO(
nombreUsuario varchar(50),
nombre varchar(100),
contrasenia varchar(15),
anioNacimiento int,
idHoroscopo int,
primary key (nombreUsuario),
CONSTRAINT  fk_idHoroscopo FOREIGN KEY (idHoroscopo) 
REFERENCES HOROSCOPO(idHoroscopo)
);


INSERT INTO USUARIO (nombreUsuario, nombre, contrasenia, anioNacimiento, idHoroscopo) 
VALUES ("Shinichikun", "Shinichi", "1234", "1996", 4);

INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (0,"Mono", "Animal más parecido al ser humano, es ingenioso, divertido, simpático, de mente rápida y despierta, comprador, persuasivo, sociable, capaces de resolver cualquier problema por difícil que sea con soltura. Sus relaciones amorosas y con los amigos suelen ser conflictivas, pues no soporta que no lo valoren. Gozan de buena salud, aunque sus excesos en las fiestas, alcohol y drogas podrían pasarle factura.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (1,"Gallo", "Atractivo y seductor, con talento y apreciado. Son meticulosos, eficientes, ordenados, buenos conversadores, observadores, egoístas, usureros, pragmáticos y muy familiares. En el amor son románticos, obstinados y luchan por el control de su pareja. Suelen destacar como relaciones públicas o como artistas. No prestan demasiada atención a su salud.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (2,"Perro", "El perro es un ser dedicado al trabajo, honesto, confiable, diligente, con un gran sentido de la justicia y la lealtad. Cautiva a todos con su personalidad excitante, su buen humor y su gran capacidad para escuchar los problemas de los demás y dar buenos consejos. En el amor son fieles y leales, aunque muy celoso cuando su pareja no está en casa. Los nervios son su mayor problema de salud.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (3,"Cerdo", "Es un animal sincero, honesto, confiado, educado, cariñoso, servicial, valiente, decidido, con gran fuerza de voluntad, sin grandes pretensiones ni vanidad, con los pies en la tierra. Son muy agradables y tienen gusto y modales impecables. En el amor son sensuales, apasionado y pacientes, pero hasta un punto. Son muy trabajadores, aunque la falta de atracción por el deporte y la apatía harán que su físico se resienta y engorde en exceso.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (4,"Rata", "Los nacidos bajo el signo de la Rata son persona sabias a las que les gusta rodearse de familiares y amigos, a quienes ayudan en sus quehaceres y problemas diarios. Buenas trabajadoras, ahorradores y buenos administradores de su economía.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (5,"Buey", "Los búfalos o bueyes son animales pacientes y tranquilos, que irradian mucho cariño y amor e infunden respeto. Grandes trabajadores, se sienten a gusto rodeados del orden y la limpieza y logran el éxito gracias a su esfuerzo. Para ellos lo más importante es la familia, aunque son celosos con su pareja. Aman el arte y la música. No les gusta discutir, aunque sí que le obedezcan. Signos compatibles: serpiente, gallo, buey. Signos incompatibles: oveja, caballo, dragón y perro.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (6,"Tigre", "Las personas de este signo son muy pasionales y llenas de energía. No pasan desapercibidas, son aventureros, independientes, ingeniosos, impulsivos y les gusta la diversión. Son amigos para toda la vida, aunque les gusta ser el líder del grupo. En el mundo de las relaciones de pareja se muestran el más fuerte, sexy y seductor, aunque de comportamiento excesivo.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (7,"Conejo", "Los que nacen en el Año del Conejo reúnen extraordinarias cualidades humanas: son prudentes, inteligentes, afables, discretos, previsores, atentos y benevolentes. De carácter moderado e indulgente, amante de la paz y la concordia, el conejo odia la guerra y la violencia. Le gusta la vida tranquila, la ternura y la armonía.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (8,"Dragon", "Símbolo del Emperador en China, el dragón es imaginativo, magnánimo, emprendedor, afortunado y poderoso. Está lleno de fuerza y vitalidad. Es un verdadero acumulador de energía y si le enojas, se enfurecerá de tal manera que perderá los estribos. Será difícil calmarle, pues no cree ni a nadie ni en nadie. Suelen dar buenos consejos y son afortunados tanto en el dinero como en el amor.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (9,"Serpiente", "Las personas Serpientes son astutas, saben lo que quieren y cómo conseguirlo. Su conversación es elegante y fluida.  Son intensos y prudentes a la vez. Son celosas y posesivas con su familia pero leales. Les gusta mimar a sus amigos y esperan de ellos una actitud recíproca. Si se sienten desdeñados o fracasan en sus tentativas, pueden estar enfadados durante horas, aunque son buenas para mantener la calma y parecer tranquilas en situaciones difíciles.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (10,"Caballo","Populares, optimistas, llenos de alegría, aventureros, elocuentes, impacientes, emprendedores, entusiastas con la vida, grandes amantes y amigos. Su gran pasión es el dinero y los viajes. Les gusta conocer gente nueva, distintas culturas, hablar idiomas y son el alma de las fiestas. Su atractivo físico y su belleza hace que les sea fácil encontrar el amor: trampa en la que caen sin remedio.");
INSERT INTO HOROSCOPO (idHoroscopo, signo, descripcion) VALUES (11,"Cabra",  "La cabra es creativa, artística, positiva, elegante, femenina, afable, compasiva, llorona, sensible, soñadora, orgullosa y triste. No persiguen la riqueza material y prefieren vivir de sus ensoñaciones. Aman la familia, los niños, el hogar y estar en contacto con la naturaleza. Son muy trabajadoras, aunque no les gusta la presión ni de una fecha límite, ni de un jefe.");

UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/mono@2x.png" WHERE idHoroscopo =0;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/gallo@2x.png" WHERE idHoroscopo =1;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/perro@2x.png" WHERE idHoroscopo =2;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/cerdo@2x.png" WHERE idHoroscopo =3;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/rata@2x.png" WHERE idHoroscopo =4;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/bufalo@2x.png" WHERE idHoroscopo =5;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/tigre@2x.png" WHERE idHoroscopo =6;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/conejo@2x.png" WHERE idHoroscopo =7;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/dragon@2x.png" WHERE idHoroscopo =8;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/serpiente@2x.png" WHERE idHoroscopo =9;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/caballo@2x.png" WHERE idHoroscopo =10;
UPDATE HOROSCOPO set url ="https://www.clarin.com/pages/bundles/horoscopochino/images/cabra@2x.png" WHERE idHoroscopo =11;

