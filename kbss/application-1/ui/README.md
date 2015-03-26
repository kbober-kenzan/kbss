# ui

This project is generated with [yo angular generator](https://github.com/yeoman/generator-angular)
version 0.11.1.

## Build & development

# Bower
Run `bower install` this will download all the required Javascript libraries

# Grunt 
Run `npm install`

Run `grunt` for building and `grunt serve` for preview.

grunt build:devt

## Testing

Running `grunt test` will run the unit tests with karma.

# Eclipse setup

Install the AngularJS Eclipse plugins 
-	http://marketplace.eclipse.org/content/angularjs-eclipse

Create a new generic project and set the location to the kbss->applictation-1->ui folder
- Once the project is in Eclipse be sure to right click on the node_modules->properties->resources->resource-filters and s
	- Exclude All : Files and Folders
	- If this is not done Eclispe will lock up when it tries to scan all the NodeJS libraries
	
	
	
