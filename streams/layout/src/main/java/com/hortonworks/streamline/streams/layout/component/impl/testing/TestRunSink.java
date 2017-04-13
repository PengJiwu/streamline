/**
 * Copyright 2017 Hortonworks.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *   http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
package com.hortonworks.streamline.streams.layout.component.impl.testing;

import com.hortonworks.streamline.streams.layout.component.StreamlineSink;

public class TestRunSink extends StreamlineSink {
    private String outputFilePath;
    private String eventLogFilePath;

    public TestRunSink() {
        this("", "");
    }

    public TestRunSink(String outputFilePath, String eventLogFilePath) {
        this.outputFilePath = outputFilePath;
        this.eventLogFilePath = eventLogFilePath;
    }

    public String getOutputFilePath() {
        return outputFilePath;
    }

    public String getEventLogFilePath() {
        return eventLogFilePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestRunSink)) return false;
        if (!super.equals(o)) return false;

        TestRunSink that = (TestRunSink) o;

        if (getOutputFilePath() != null ? !getOutputFilePath().equals(that.getOutputFilePath()) : that.getOutputFilePath() != null)
            return false;
        return getEventLogFilePath() != null ? getEventLogFilePath().equals(that.getEventLogFilePath()) : that.getEventLogFilePath() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getOutputFilePath() != null ? getOutputFilePath().hashCode() : 0);
        result = 31 * result + (getEventLogFilePath() != null ? getEventLogFilePath().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestRunSink{" +
                "outputFilePath='" + outputFilePath + '\'' +
                ", eventLogFilePath='" + eventLogFilePath + '\'' +
                '}';
    }

}
