/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.onlinedemo;

import java.util.Map;

public interface IWorkerPoolFactory
{
    IWorkerPool create(int maxRequests, Map<String, CompileResponseDto> compileResponses, int numberOfWorkers);
}
