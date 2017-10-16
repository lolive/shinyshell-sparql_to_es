# Package "Shinyshell-sparql_to_es":


$ aggregatedata  : "Packs the objects for each given subject. For example: :a :b :c; :a :b :d; becomes :a :b :c,:d."

$ bulk JSON_DIR ES_INDEX : ""

$ install_es_for_sparql_indexing ES_DIR : ""

$ monitor_loads METADATA_LOAD_DIR : "Monitor the endpoint metadata retrieval process. Use for example after a "retrieve_endpoint_metadata". Example: retrieve_endpoint_metadata $HOME/.tmp http://dbpedia.datao.net/sparql http://dbpedia.org/ & monitor_loads $HOME/.tmp"

$ retrieve_alive_endpoints_metadata  : ""

$ retrieve_endpoint_labels ENDPOINT _NAMEDGRAPH : ""

$ retrieve_endpoint_longlats ENDPOINT NAMEDGRAPH : ""

$ retrieve_endpoint_metadata METADATA_LOAD_DIR ENDPOINT _NAMEDGRAPH : " Stores in $METADATA_LOAD_DIR the metadata of an endpoint (resp endpoint/namedgraph): labels, Note that results are aggregated (cf view_help aggregatedata for more info). Example: retrieve_endpoint_metadata $HOME/.tmp http://dbpedia.datao.net/sparql http://dbpedia.org/ "

$ retrieve_endpoint_sameas ENDPOINT _NAMEDGRAPH : ""

$ retrieve_endpoint_types ENDPOINT _NAMEDGRAPH : ""

$ usv2esUpsert  : ""


This package contains the following functions:


## aggregatedata  :

Packs the objects for each given subject.
For example: :a :b :c; :a :b :d; becomes :a :b :c,:d.


## bulk JSON_DIR ES_INDEX :



## install_es_for_sparql_indexing ES_DIR :



## monitor_loads METADATA_LOAD_DIR :

Monitor the endpoint metadata retrieval process.
Use for example after a "retrieve_endpoint_metadata".

Example:
retrieve_endpoint_metadata $HOME/.tmp http://dbpedia.datao.net/sparql http://dbpedia.org/ &
monitor_loads $HOME/.tmp


## retrieve_alive_endpoints_metadata  :



## retrieve_endpoint_labels ENDPOINT _NAMEDGRAPH :



## retrieve_endpoint_longlats ENDPOINT NAMEDGRAPH :



## retrieve_endpoint_metadata METADATA_LOAD_DIR ENDPOINT _NAMEDGRAPH :


Stores in $METADATA_LOAD_DIR the metadata of an endpoint (resp endpoint/namedgraph): labels,
Note that results are aggregated (cf view_help aggregatedata for more info).
Example:
retrieve_endpoint_metadata $HOME/.tmp http://dbpedia.datao.net/sparql http://dbpedia.org/ 


## retrieve_endpoint_sameas ENDPOINT _NAMEDGRAPH :



## retrieve_endpoint_types ENDPOINT _NAMEDGRAPH :



## usv2esUpsert  :


