/*
 * This software has been provided to provide sample code and to aid
 * the software engineering community. It is published under the MIT
 * license. You are welcome to use the code, but please do not take
 * credit for my work.
 *
 * Author: DenalidTX
 * Twitter: @DenalidTX
 * Twitch: https://www.twitch.tv/denalidtx
 */

package com.denalidtx.samples.jpms.pluginreader;

import com.denalidtx.samples.jpms.pluginreader.plugininterface.MessageProvider;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Main
{
    /**
     * Standard main method.
     *
     * @param args Command-line arguments. Ignored.
     */
    public static void main(String[] args)
    {
        System.out.println("Sending the default greeting: ");
        System.out.println("Hello World");

        System.out.println("Executing plugins...");
        // Iterate through all MessageProvider service providers and run the getMessage() method
        // for each one. If no plugins are present, the list will simply be empty.
        loadPlugins().forEach(messageProvider -> System.out.println(messageProvider.getMessage("World")));
        System.out.println("Done executing plugins.");
    }

    /**
     * Use the JPMS Service Loader to identify and instantiate classes which both
     * implement the MessageProvider interface and 'provide' the implementation
     * via a module-info.java file.
     *
     * @return A list of MessageProvider implementations, or an empty list if there are none.
     */
    private static List<MessageProvider> loadPlugins()
    {
        // First create ServiceLoader objects. This will make one per plugin
        // that provides a MessageProvider implementation.
        ServiceLoader<MessageProvider> pluginServiceLoader = ServiceLoader.load(MessageProvider.class);
        // Then use the ServiceLoader to instantiate each implementation;
        // aggregate those into a list and return.
        return pluginServiceLoader.stream().map(ServiceLoader.Provider::get).collect(Collectors.toList());
    }
}
