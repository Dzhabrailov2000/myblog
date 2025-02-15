# Приложение-блог (Spring Framework)

Данный проект представляет собой веб-приложение для ведения блога, **не использующее Spring Boot**.  
Приложение написано на **Java 21**, собирается с помощью **Maven** или **Gradle** и разворачивается  
в современном сервлет-контейнере (например, Jetty или Tomcat).

---

## Требования

1. **Spring:** версия 6.1 и выше
2. **Сервер:** Jetty или Tomcat
3. **Отсутствие Spring Boot** (необходимо для обучающего спринта)
4. **Система контроля версий:** Git (GitHub)
5. **Система сборки:** Maven или Gradle
6. **Java:** 21
7. **База данных:**
    - Персистентная (например, PostgreSQL), **или**
    - In-memory (например, H2)
8. **Тестирование:**
    - Unit-тесты и интеграционные тесты (JUnit 5, Spring TestContext Framework)
    - Используется кэширование контекстов для ускорения тестов

---

## Функциональность приложения

### Общая структура

- Две веб-страницы (HTML + JavaScript):
    1. **Лента постов**
    2. **Страница поста**

### Лента постов

- Отображает превью каждого поста:
    - Название поста
    - Картинка
    - Первый абзац текста (не более трёх строк)
- Отображает:
    - Количество комментариев
    - Количество лайков
    - Теги поста
- Посты располагаются сверху вниз
- **Фильтрация по тегу**
- **Пагинация** (10, 20 или 50 постов на странице)

#### Добавление нового поста

- Кнопка «Добавить пост» открывает форму с полями:
    - Название
    - Картинка
    - Текст (можно разбивать на абзацы)
    - Теги (возможность указать несколько)

### Страница поста

- Отображает:
    - Название
    - Картинку
    - Текст поста (по абзацам)
    - Теги
- Управление:
    - **Удалить пост**
    - **Редактировать пост** (форма аналогична добавлению)
- **Лайки**: по клику счётчик лайков увеличивается на 1
- **Комментарии**:
    - Список комментариев (вложенная структура не требуется)
    - Кнопка для добавления комментария
    - Для каждого комментария:
        - Редактирование (по клику заменяется на поле ввода; сохранение по Ctrl+Enter)
        - Удаление

---

## Тестирование

- **Unit-тесты** и **интеграционные тесты** с использованием JUnit 5 и Spring TestContext Framework.
- **Кэширование контекстов** для ускорения тестового цикла.

---

## Сборка и запуск

1. Клонировать репозиторий с GitHub.
2. Собрать проект:

   ```bash
   # Для Maven
   mvn clean install