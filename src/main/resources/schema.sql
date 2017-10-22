CREATE TABLE IF NOT EXISTS restaurant (
    id              INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    station         VARCHAR(255) NOT NULL,
    name            VARCHAR(255) NOT NULL UNIQUE,
    genre           VARCHAR(255) NOT NULL,
    lunch_or_dinner VARCHAR(25),
    budget_lower    INTEGER,
    budget_upper    INTEGER,
    star            FLOAT NOT NULL,
    good            VARCHAR(255) NOT NULL,
    tabelog         VARCHAR(255),
    created_at      datetime NOT NULL,
    updated_at      TIMESTAMP on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    INDEX(`name`),
    INDEX(`star`)
) ENGINE=InnoDB DEFAULT CHARACTER SET utf8;

CREATE TABLE IF NOT EXISTS user (
    id           INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name         VARCHAR(255) NOT NULL UNIQUE,
    password     VARCHAR(255) NOT NULL,
    created_at   VARCHAR(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARACTER SET utf8;

CREATE TABLE IF NOT EXISTS favorite (
    id            INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    user_id       INTEGER NOT NULL,
    restaurant_id INTEGER NOT NULL,
    created_at    VARCHAR(255) NOT NULL,

    INDEX `target_data` (`user_id`, `restaurant_id`),
    foreign key(user_id) references user(id),
    foreign key(restaurant_id) references restaurant(id)
) ENGINE=InnoDB DEFAULT CHARACTER SET utf8;