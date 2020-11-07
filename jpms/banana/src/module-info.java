module banana {
  requires service;
  provides pkg.spi.MyService with pkg.banana.BananaService, pkg.banana.RipeBananaService;
//  provides pkg.spi.MyService with pkg.banana.RipeBananaService;
}
