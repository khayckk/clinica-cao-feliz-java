CREATE SCHEMA IF NOT EXISTS `clinica_cao_feliz` DEFAULT CHARACTER SET utf8mb4;
USE `clinica_cao_feliz`;

-- -----------------------------------------------------
-- Table `Pessoa` (Superclasse)
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pessoa` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `telefone` VARCHAR(20) NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Tutor` (Subclasse de Pessoa)
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Tutor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `endereco` VARCHAR(150) NULL,
  `pessoa_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Tutor_Pessoa`
    FOREIGN KEY (`pessoa_id`)
    REFERENCES `Pessoa` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Veterinario` (Subclasse de Pessoa)
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Veterinario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `crmv` VARCHAR(30) NOT NULL,
  `pessoa_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Veterinario_Pessoa`
    FOREIGN KEY (`pessoa_id`)
    REFERENCES `Pessoa` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Pet` (Classe Associada)
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pet` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `especie` VARCHAR(45) NOT NULL,
  `idade` INT NULL,
  `tutor_id` INT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_Pet_Tutor`
    FOREIGN KEY (`tutor_id`)
    REFERENCES `Tutor` (`id`)
    ON DELETE SET NULL
    ON UPDATE CASCADE
) ENGINE = InnoDB;