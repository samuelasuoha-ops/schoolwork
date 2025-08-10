const apiKey = '1Zy9F4686B9DXXVrjRIpgavdPTwfOs71F1y6OsRI';

const headers = new Headers();
const reqInit = { method: 'GET', headers: headers, mode: 'cors', cache: 'default' };

const defaultSource = 'nasa';

async function getData(source  = defaultSource) {

    const url = 'https://api.nasa.gov/planetary/apod?api_key=1Zy9F4686B9DXXVrjRIpgavdPTwfOs71F1y6OsRI';
    try{
        const response = await fetch(url, reqInit);

        const json = await response.json();

        console.log(json);

        

    } catch (err) {
        console.log(err);
    }
}

getData('nasa');

console.log('Has getData() finished yet?');



// Function accepts an array of news articles

// Articles are parsed and displayed

function displayData(nasa) {

    // log the articles in the console
    
    console.log(nasa);
    
    // Set the source element of the page to display news source (from the first [0] article)
    
    document.getElementById('source').innerHTML = nasa[0].source.name;
    
    // Get articles and add each one to the root element
    
    // the array map function iterates trough each object element in an array
    
    // read as 'for each article in articles, do this...'
    
    let output = nasa.map(nasa => {
    
    // returns a template string for each article, values are inserted using ${ }
    
    // <article> is an HTML5 semantic elememt which matches our needs but div could also be used
    
    return `<article>
    
    <h4>${nasa.title}</h4>
    
    <p>${article.author}</p>
    
    <p>${article.publishedAt}</p>
    
    <img src=${article.urlToImage} alt='article image'>
    
    <p>${article.description}</p>
    
    <p><a href='http://#'>Read More</a></p>
    
    </article>`;
    
    });
    
    // output, the result of the previous step, is an array of formatted articles
    
    // Set the innerHTML of the articles root element = output
    
    let articlesElement = document.getElementById('articles')
    
    articlesElement.innerHTML = output;
    
    } // end function