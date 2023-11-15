/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bassirscript;

import java.io.File;
import java.util.Scanner;
import models.ExecutionContext;
import models.Script;
import service.CommandFactory;
import service.ScriptExecuter;
import service.scriptloader.contracts.ScriptLoader;
import service.scriptloader.contracts.ScriptLoaderProvider;

/**
 *
 * @author Lenovo
 */
public class Application {

    private final CommandFactory commandFactory;
    private final ScriptExecuter scriptExecuter;
    private final ScriptLoaderProvider scriptLoaderProvider;

    public Application(CommandFactory commandFactory, ScriptExecuter scriptExecuter, ScriptLoaderProvider scriptLoaderProvider) {

        this.commandFactory = commandFactory;
        this.scriptExecuter = scriptExecuter;
        this.scriptLoaderProvider = scriptLoaderProvider;
    }

    public void Run() {

        System.out.println(new File(".").getAbsoluteFile().getAbsolutePath());

        System.out.println("Enter adress : ");

        Scanner scanner = new Scanner(System.in);

        String address = scanner.nextLine();

        ScriptLoader scriptLoader = scriptLoaderProvider.getScriptLoader();

        if (scriptLoader.validateFile(address)) {

            Script script = scriptLoader.script(address);

            ExecutionContext context = new ExecutionContext();

            scriptExecuter.execute(script, context, commandFactory);
        } else {
            System.err.println("Invalid File.");
        }
    }

}
