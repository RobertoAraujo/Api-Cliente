DROP database if EXISTS desafio;
CREATE database if NOT EXISTS desafio;
use desafio;

CREATE TABLE `estatistica` (
`id` bigint(20) NOT NULL,
`acessos` bigint(20) DEFAULT NULL,
`url_encurtada` varchar(255) DEFAULT NULL
);

ALTER TABLE `estatistica`
    MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

CREATE TABLE `url_entity` (
`id` bigint(20) NOT NULL,
`url` varchar(255) DEFAULT NULL,
`url_encurtada` varchar(255) DEFAULT NULL
);

ALTER TABLE `url_entity`
    MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

COMMIT;