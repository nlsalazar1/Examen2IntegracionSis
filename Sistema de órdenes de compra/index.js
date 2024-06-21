function getCharacters(done) {
    const results = fetch("https://rickandmortyapi.com/api/character");

    results
        .then(response => response.json())
        .then(data => {
            done(data);
        });
}

getCharacters(data => {
    data.results.forEach(personaje => {
        const article = document.createRange().createContextualFragment(/*html*/`
        <article>
            <div class="image-container">
                <img src="${personaje.image}" alt="Personaje">
            </div>
            <h2>${personaje.name}</h2>
            <span>${personaje.status}</span>
        </article>
        `);

        const main = document.querySelector("main");
        main.append(article);
    });
});

document.getElementById('generateExcel').addEventListener('click', function() {
    getCharacters(data => {
        const characters = data.results.map(personaje => ({
            image: personaje.image,
            name: personaje.name,
            status: personaje.status
        }));

        // Crear un libro de trabajo
        const workbook = XLSX.utils.book_new();

        // Crear una hoja de trabajo a partir de los datos
        const worksheet = XLSX.utils.json_to_sheet(characters);

        // Agregar la hoja de trabajo al libro de trabajo
        XLSX.utils.book_append_sheet(workbook, worksheet, "Personajes");

        // Guardar el libro de trabajo en un archivo
        XLSX.writeFile(workbook, "personajes.xlsx");
    });
});


/*CONSUMO DE API FUNCIONAL*/

/*function getCharacters(done){
    const results = fetch("https://rickandmortyapi.com/api/character");

    results
        .then(response => response.json())
        .then(data => {
            done(data)
        });
}

getCharacters(data => {
    data.results.forEach(personaje => {
        const article = document.createRange().createContextualFragment(    
        <article>
            <div class="image-container">
                <img src="${personaje.image}" alt="Personaje">
            </div>
            <h2>${personaje.name}</h2>
            <span>${personaje.status}</span>
        </article>
        `);

        const main = document.querySelector("main");
        main.append(article);
    });
});*/