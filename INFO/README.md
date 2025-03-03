
# Домашнє завдання

## Назва: Програма “Клієнт-Сервер”

## Завдання:

Необхідно виправити код програми.

Програма повинна працювати з певними умовами та результатом.

Сервер повинен вміти приймати вхідні з'єднання від клієнтів
у необмеженій кількості. Простіше кажучи, до сервера можуть
підключитися більше одного клієнта.

Після успішного підключення клієнта сервер зберігає інформацію
про нього в «активні з'єднання».
Дані сервера, які виводяться в консоль, мають такий формат
(дата та час залежать від Вашого запуску програми):

```
Server started on 0.0.0.0:8089
[SERVER] Client Client-1 connected to server at 2025-02-13T11:05:46.916271500
[SERVER] Client Client-2 connected to server at 2025-02-13T11:05:46.922000400
[SERVER] Client Client-3 connected to server at 2025-02-13T11:05:46.922833800
[SERVER] Client Client-4 connected to server at 2025-02-13T11:05:46.923343500
[SERVER] Client Client-5 connected to server at 2025-02-13T11:05:46.923843700
[SERVER] Removed connection for Client-1
[SERVER] Removed connection for Client-2
[SERVER] Removed connection for Client-3
[SERVER] Removed connection for Client-4
[SERVER] Removed connection for Client-5
```

Клієнт повинен вміти підключатися до сервера.

Клієнт повинен вміти надсилати спеціальні команди
для сервера.

