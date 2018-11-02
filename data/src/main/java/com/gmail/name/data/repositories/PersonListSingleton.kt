package com.gmail.name.data.repositories

import com.gmail.name.domain.entity.Person

object PersonListSingleton {

    val list: MutableList<Person> = mutableListOf(
            Person("0", "Peter", "Parker", "http://ezine.kungfumagazine.com/images/ezine/0706_Spiderman-Maquire.jpg"),
            Person("1", "Robert", "Banner", "https://www.film.ru/sites/default/files/filefield_paths/the-hulk-thanos.jpg"),
            Person("2", "Stephen", "Strange", "https://www.superheldenfilme.net/wp-content/uploads/2017/10/doctorstrangeeindoctorstrange2wirdsehrsicherkommen.jpg"),
            Person("3", "Tony", "Stark", "https://www.zonanegativa.com/imagenes/2016/04/Iron_Man-600x251.jpg"),
            Person("4", "Bruce", "Wayne", "https://nerdist.com/wp-content/uploads/2016/03/Batman-Christian-Bale.jpg"),
            Person("5", "Clark", "Kent", "https://cdn.images.express.co.uk/img/dynamic/36/590x/Superman-cameo-revealed-for-Shazam-937873.jpg"),
            Person("6", "Diana", "Prince", "https://nerdist.com/wp-content/uploads/2018/08/WW84-Diana-Featured.jpg"),
            Person("7", "Selina", "Kyle", "http://s24195.pcdn.co/wp-content/uploads/2017/11/ls60mj4ry60rrjlt06h1.jpg"),
            Person("8", "Natalia", "Romanova", "https://i.ytimg.com/vi/Nh6ZRy0nekA/maxresdefault.jpg"),
            Person("9", "Barry", "Allen", "https://24smi.org/public/media/news/2017/10/13/aAETSb6LAVlI_film-flesh-aktery-i-roli.jpg"))
}