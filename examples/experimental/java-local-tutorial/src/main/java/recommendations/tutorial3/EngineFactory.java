package org.apache.predictionio.examples.java.recommendations.tutorial3;

import org.apache.predictionio.examples.java.recommendations.tutorial1.Algorithm;
import org.apache.predictionio.examples.java.recommendations.tutorial1.TrainingData;
import org.apache.predictionio.examples.java.recommendations.tutorial1.Query;

import org.apache.predictionio.controller.java.IJavaEngineFactory;
import org.apache.predictionio.controller.java.JavaSimpleEngine;
import org.apache.predictionio.controller.java.JavaSimpleEngineBuilder;

public class EngineFactory implements IJavaEngineFactory {
  public JavaSimpleEngine<TrainingData, Object, Query, Float, Float> apply() {
    return new JavaSimpleEngineBuilder<
      TrainingData, Object, Query, Float, Float> ()
      .dataSourceClass(DataSource.class)
      .preparatorClass() // Use default Preparator
      .addAlgorithmClass("MyRecommendationAlgo", Algorithm.class)
      .servingClass() // Use default Serving
      .build();
  }
}
