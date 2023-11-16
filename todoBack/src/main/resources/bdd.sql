SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


CREATE TABLE `task` (
    `id` bigint NOT NULL,
    `title` varchar(255) DEFAULT NULL,
    `description` varchar(255) DEFAULT NULL,
    `priority` varchar(255) DEFAULT NULL,
    `status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



INSERT INTO `task` (`id`, `title`, `description`, `due_date`) VALUES (1, 'write the course on angular'),(2, 'write the course on rxjs'),(3, 'Do the Todo List');

ALTER TABLE `task`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `task`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
