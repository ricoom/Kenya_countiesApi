url=`http://localhost:8080/api`
const selectC=document.getElementById("selectCounty");
const subCads=document.getElementById("subcountyCards");
const wardcard=document.getElementById("wardCards");

let counties=[]
var allconstituencies=[]
var mywards=[]


window.onload=showCounties()


async function showCounties() {
    await fetch(`${url}/counties`)
.then(async (res) => {
    counties= await res.json();
    console.log(counties)
    addCoutyoption()

}).catch((err) => {
    console.log(err)
    
})
}

  function showsubcounty($event) {
    allconstituencies=[]
    let county=$event.value;

   let obj= counties.find(cty=>cty.name==county)
  
//    console.log(obj)
   
    obj.constituencies.forEach((c) => {
        allconstituencies.push(c.name)
        subCads.innerText=allconstituencies

        
console.log(allconstituencies+"new")
    })
    for (let i = 0; i < allconstituencies.length; i++) {
        subCads.insertAdjacentHTML('afterbegin',`<ul><li id="mylist" onclick="showWards(this)">${allconstituencies[i]}</li></ul>`)
       
    }
   

}

   
async function showWards($event) {
   var mysubc= $event.innerText
let listc=[...counties]
let listSubc=[]
listc.forEach(county=>{

    console.log(county.constituencies.wards)

})

let selectedsub=listSubc.find(scty=>scty.name==mysubc)
for (let i = 0; i < mywards.length; i++) {
    wardcard.insertAdjacentHTML('afterbegin',`<ul><li id="mylist">${listSubc[i]}</li></ul>`)
   
}

} 


function addCoutyoption() {
    for (let i = 0; i < counties.length; i++) {
        let option=document.createElement("option");
    
        option.value=counties[i].name;
        option.text=counties[i].name;
    
        selectC.appendChild(option)
        
    }
}
