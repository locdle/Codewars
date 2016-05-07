module SquareSum where

squareSum :: [Integer] -> Integer
-- Your code here
squareSum = foldl (\acc x -> acc + x^2 ) 0
