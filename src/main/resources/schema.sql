CREATE TABLE IF NOT EXISTS `user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `car` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_CAR_USER`
    FOREIGN KEY (`user_id`)
    REFERENCES `user` (`id`)
);

CREATE TABLE IF NOT EXISTS `car_rent` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `car_relation` (
  `user_id` INT NOT NULL,
  `car_rent_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `car_rent_id`),
  CONSTRAINT `FK_CAR_RELATION_USER`
    FOREIGN KEY (`user_id`)
    REFERENCES `user` (`id`),
  CONSTRAINT `FK_CAR_RELATION_CAR_RENT`
    FOREIGN KEY (`car_rent_id`)
    REFERENCES `car_rent` (`id`)
);
