## Installation
Berikut Langkah langkah penginstallan aplikasi
  1. Clone Repository ini
  2. Build Maven depedency
  3. [Jalankan aplikasi ini](src/main/java/oxtcode_dev/trefind/TrefindApplication.java)

<br/>

## Build With
Aplikasi ini dibangun dengan beberapa depedency, yaitu diantaranya :
  - Lombok
  - Spring Web
  - JDBC
  - MySQL Driver

Database :
  - MySQL

<br/>

## Usage
|           URL Request           |   Method   | Url Params  | Body Type |
| :-----------------------------: | :--------: | :---------: | :-------: |
|     `[Your Host]/api/videos/`     |  **GET**   |    None     |   None    |
| `[Your Host]/api/videos/specific` |  **GET**   |    None     |   None    |
|    `[Your Host]/api/videos/<:id>`    |  **GET**   | id (String) |   None    |
|     `[Your Host]/api/videos/ `    |  **POST**  |    None     |   JSON    |
|    `[Your Host]/api/videos/<:id>`    |  **PUT**   | id (String) |   JSON    |
|    `[Your Host]/api/videos/<:id>`    | **DELETE** | Id (String) |   None    |

<br/>
