# TreeOfLife
Back end server for a catalog of all life on earth (prototype for learning Spring) 

## Database
### Design (current)
  * simply one table called creatures
  * Did this for simplicities sake, would implement the database differently, (v2) 
  * Does not take advantage of relational schema
  * TODO: 
    * add another table consisting of the taxonomy of an entire species, that way can find a species full taxonomy by running:  
      ` SELECT * FROM creature, taxonomy WHERE creature.species = taxonomy.species ` 
    * add more information in database for creatures
### Design (v2) 
   * could split the tables based on classes, such as mammals, maxillopoda, etc. 
   * This might be slower but may save on memory 
   * Would also allow for more dynamic models based on database tables
   
   
## REST Endpoints (haven't implemented all of taxonomy)
https://treeoflife.cfapps.io/ 
|Table | Method | Endpoint | Description | 
|---------------|:------------------:|-----|---------|
| Creatures | GET<br>POST<br>PUT<br>DELETE | `/creatures`<br>`/creatures/{species}`<br>`/creatures/post`<br>`/creatures/{id}`<br>`/creatures/{id}`| get all creatures<br>get creature by species<br>Post new creature<br>update a creature<br>delete a creature by id | 
|Taxonomy| GET<br>POST<br>PUT<br>DELETE |`taxonomy/{genus species}`<br>`taxonomy/{genus species}`<br>`taxonomy/{genus species}`<br>`taxonomy/{genus species}` | get full taxonomy by species<br> Post new taxonomy for a species<br> Update a taxonomy/correct<br> delete a taxonomy |

