fun userCommittedGaze(position: Vector3, go: GameObject) {
    val anchor: CoordinateSystem = createSpatialAnchorApproximateAt(position)
    val globalToAnchor: Matrix4 = createTransformationMatrix(from=stationaryFrameOfReference, to=anchorCoordinateSystem)
    val positionInAnchor = position.transform(globalToAnchor)
    anchor.add(go, positionInAnchor)
}
