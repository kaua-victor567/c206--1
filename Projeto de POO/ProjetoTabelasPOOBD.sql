-- MySQL Workbench Forward Engineering

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Plantas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Plantas` (
  `idPlantas` INT NOT NULL,
  `nome` VARCHAR(255) NOT NULL,
  `tipo` VARCHAR(255) NOT NULL,
  `precoVenda` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`idPlantas`))
;

-- -----------------------------------------------------
-- Table `mydb`.`Fazendas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Fazendas` (
  `idFazendas` INT NOT NULL,
  `nome` VARCHAR(255) NOT NULL,
  `localizacao` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idFazendas`))
;

-- -----------------------------------------------------
-- Table `mydb`.`Fazendeiro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Fazendeiro` (
  `idFazendeiros` INT NOT NULL,
  `nome` VARCHAR(255) NOT NULL,
  `idade` INT NOT NULL,
  `Fazendas_idFazendas` INT NOT NULL,
  PRIMARY KEY (`idFazendeiros`),
  CONSTRAINT `fk_Fazendeiro_Fazendas1`
    FOREIGN KEY (`Fazendas_idFazendas`)
    REFERENCES `mydb`.`Fazendas` (`idFazendas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

-- -----------------------------------------------------
-- Table `mydb`.`Cultivos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cultivos` (
  `idCultivos` INT NOT NULL,
  `dataPlantio` DATE NOT NULL,
  `dataColheita` DATE NULL,
  `Plantas_idPlantas` INT NOT NULL,
  `Fazendas_idFazendas` INT NOT NULL,
  PRIMARY KEY (`idCultivos`),
  CONSTRAINT `fk_Cultivos_Plantas1`
    FOREIGN KEY (`Plantas_idPlantas`)
    REFERENCES `mydb`.`Plantas` (`idPlantas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cultivos_Fazendas1`
    FOREIGN KEY (`Fazendas_idFazendas`)
    REFERENCES `mydb`.`Fazendas` (`idFazendas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

-- -----------------------------------------------------
-- Table `mydb`.`Fazendas_has_Plantas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Fazendas_has_Plantas` (
  `Fazendas_idFazendas` INT NOT NULL,
  `Plantas_idPlantas` INT NOT NULL,
  PRIMARY KEY (`Fazendas_idFazendas`, `Plantas_idPlantas`),
  CONSTRAINT `fk_Fazendas_has_Plantas_Fazendas1`
    FOREIGN KEY (`Fazendas_idFazendas`)
    REFERENCES `mydb`.`Fazendas` (`idFazendas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Fazendas_has_Plantas_Plantas1`
    FOREIGN KEY (`Plantas_idPlantas`)
    REFERENCES `mydb`.`Plantas` (`idPlantas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;


