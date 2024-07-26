CREATE TABLE IF NOT EXISTS SysUser
(
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    email    VARCHAR(50) NOT NULL UNIQUE
);

-- Populando banco usuários
INSERT INTO SysUser (name, email, password)
VALUES ('willian', 'willian@gmail.com', '1234')
ON CONFLICT (email) DO NOTHING;
