# jpms-plugin-sample

This is a minimal project demonstrating the use of JPMS modules and service providers to create and load plugins.

The project includes a multi-module Maven build configuration. If you run the "compile" and "install" tasks the build
will place all required jars into the respective lib/ directory for each Maven module. The included
run-without-plugin.bat and run-with-plugin.bat file will start the application on Windows. (It should also work on
Linux, but I have not actually tested that.)

Note: JPMS and Maven both refer to "modules". The Maven module is a buildable unit, and the parent module aggregates the
child modules. The JPMS module is an executable unit. The jpms.plugin.reader JPMS module contains the application entry
point and can run independently, and the my-plugin-reader Maven module builds it. The my.plugin JPMS module contains the
plugin and has no _main()_ method, and the my-plugin Maven module builds it. The jpms-plugin-sample Maven module is the
parent for the other two Maven modules; it does not have any code of its own.

The module-info.java file includes explanations for each of the module statements.

Starting the app with run-without-plugin.bat will use a JPMS module path that only includes the jpms.plugin.reader JPMS
module. As a result, it will not load any plugins and will have only the output explicitly written into the _main()_
method. Starting the app with run-with-plugin.bat will use a JPMS module path that additionally includes the my.plugin
JPMS module. This will cause the application to also print the output from the plugin module.