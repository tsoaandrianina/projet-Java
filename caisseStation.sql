#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Client
#------------------------------------------------------------

CREATE TABLE Client(
        NumCli Int NOT NULL ,
        NomCli Varchar (80) NOT NULL ,
        TelCli Char (10) NOT NULL
	,CONSTRAINT Client_PK PRIMARY KEY (NumCli)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Produit
#------------------------------------------------------------

CREATE TABLE Produit(
        CodeProduit     Int NOT NULL ,
        Designation     Varchar (60) NOT NULL ,
        Conditionnement Varchar (60) NOT NULL ,
        pu              Int NOT NULL ,
        Quantite        Int NOT NULL
	,CONSTRAINT Produit_PK PRIMARY KEY (CodeProduit)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Caisser
#------------------------------------------------------------

CREATE TABLE Caisser(
        NumCaisse Int NOT NULL ,
        Nom       Varchar (80) NOT NULL ,
        contact   Char (10) NOT NULL ,
        pwd       Varchar (10) NOT NULL
	,CONSTRAINT Caisser_PK PRIMARY KEY (NumCaisse)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: commande
#------------------------------------------------------------

CREATE TABLE commande(
        NumCli      Int NOT NULL ,
        CodeProduit Int NOT NULL ,
        NumCaisse   Int NOT NULL ,
        quantite    Int NOT NULL ,
        dateAchat   Date NOT NULL
	,CONSTRAINT commande_PK PRIMARY KEY (NumCli,CodeProduit,NumCaisse)

	,CONSTRAINT commande_Client_FK FOREIGN KEY (NumCli) REFERENCES Client(NumCli)
	,CONSTRAINT commande_Produit0_FK FOREIGN KEY (CodeProduit) REFERENCES Produit(CodeProduit)
	,CONSTRAINT commande_Caisser1_FK FOREIGN KEY (NumCaisse) REFERENCES Caisser(NumCaisse)
)ENGINE=InnoDB;

